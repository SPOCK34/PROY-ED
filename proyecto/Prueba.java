
import java.util.StringTokenizer;
public class Prueba {


       static Lista ls=new Lista();

    public static void main(String[] args) {
        GuardarLS();
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
            texto= texto=texto.replace(" ","");
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
        if(!((texto.charAt(i) >='A' && texto.charAt(i) <= 'Z') || (texto.charAt(i)=='.' || texto.charAt(i)== ',')))
         {
            System.out.println("EL TEXTO NO ES VALIDO  =/ ");
            return true;
         }    
         return false;     
      }
 public static void TrabajaPremisa(Lista ls)
  {
    ls.Codificar();

  }


    
}
