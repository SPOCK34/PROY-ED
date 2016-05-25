
import java.util.StringTokenizer;
public class Prueba {


       static Lista ls=new Lista();
       static Lista lspr=new Lista();
    public static void main(String[] args) {
        GuardarLS();
        TrabajaPremisa(ls);
        lspr.Listar();
        
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
          ls.Insertar(texto);
          
        //SepararPremisas(texto);
     }
 public static void SepararPremisas(String texto)
     {
        StringTokenizer token = new StringTokenizer(texto, ".");
         
        while (token.hasMoreTokens())
            lspr.Insertar(token.nextToken());   
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
    
    System.out.println(p);
    String aux="";
    for(int i=0;i<p.length();i++)
    {
        char j=p.charAt(i);
        if(j== '1'|| j=='2'|| j=='3'||j=='^'|| j=='v')
        {
            aux= aux+"77";
        }
        else
        {
            aux=aux+(p.charAt(i));
        }
    }
    
    aux=aux.replace(" ","");
    p=p.replace(" ","");

    SepararPremisas(aux);
    System.out.println(aux);
    PremisasM2(p);
    return p;
  }
  public static void PremisasM2(String p)
  {
    Nodo q;
            String aux;
            for (q= lspr.GetNodoH(); q!= null; q=q.GetLigaDer())
            {
                aux=q.GetInfo();

                q.SetInfo(literales(aux,p));
            }
  }

  public static String literales(String aux, String p)
  {
    String [] arr = aux.split("77");
     String ll="";
    String [] literales= {"p","q","r","s","t","v","w","z"};

    for (int i=0;i<arr.length ;i++ ) {
        ll=arr[i];
        p=p.replace(ll,literales[i]);
    }
    return p;
  }
    
}
