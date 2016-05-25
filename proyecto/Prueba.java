
import java.util.StringTokenizer;
public class Prueba {


       static Lista ls=new Lista();

    public static void main(String[] args) {
        GuardarLS();
        TrabajaPremisa(ls);
        ls.Listar();
        
    }

 public static void GuardarLS()
     {
        
        boolean valida=false;
        String texto="";
     do
        {
            texto = Teclado.LeeCadena("Comience a escribir: ");
            texto=texto=texto.toUpperCase();
            //texto= texto=texto.replace(" ","");
            valida=ValidaTexto(texto);
        }while(valida);

        SepararPremisas(texto);
     }
 public static void SepararPremisas(String texto)
     {
        StringTokenizer token = new StringTokenizer(texto, ".");
         
        while (token.hasMoreTokens())
            ls.Insertar(token.nextToken());   
     }
 public static boolean ValidaTexto(String texto)
     {
        for(int i=0;i<texto.length();i++)
        if(!((texto.charAt(i) >='A' && texto.charAt(i) <= 'Z') || (texto.charAt(i)=='.' || texto.charAt(i)== ','|| texto.charAt(i)==' ')))
         {
            System.out.println("EL TEXTO NO ES VALIDO  =/ ");
            return true;
         }    
         return false;     
      }
 public static void TrabajaPremisa(Lista ls)
  {
    ls.Codificar();
    Nodo q;
            String aux;
            for (q= ls.GetNodoH(); q!= null; q=q.GetLigaDer())
            {
                aux=q.GetInfo();
                q.SetInfo(PremisasM1(aux));
            }

  }

  public static String PremisasM1(String p)
  {
    char [] sim= new char[p.length()];
    String aux="",aux2="";
    for(int i=0;i<p.length();i++)
    {
        char j=p.charAt(i);
        if(j== '1'|| j=='2'|| j=='3'||j=='^'|| j=='v'||j==',')
        {
            
            sim[i]=j;
            aux= aux+"77";
        }
        else
        {
            if(j=='0')
            {
                sim[i]=j;
                aux=aux+"-";
            }
            else
            aux=aux+(p.charAt(i));
        }
    }

    aux=aux.replace(" ","");
    aux2=aux.replace("-","");
    String [] arr = aux2.split("77");
    String ll="";

    for (int i=0;i<arr.length ;i++ ) {
        ll=arr[i];
        aux=aux.replace(ll,"5"+i);
    }

    
     System.out.println(aux);
   
    return p;
  }
    
}
