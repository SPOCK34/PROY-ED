
public class Premisas
{
		Lista ls = new Lista();
	

	public int Npuntos(String cadena)
	{
		int numeropuntos=0;

			for(int i=0; i<cadena.length();i++)
				if (cadena.charAt(i)=='.') 
						numeropuntos++;
				
		return numeropuntos;		
		} 

	

	public int Ncomas(String cadena)
	{
		int numcomas=0;
			for(int i=0;i<cadena.length();i++)
				if (cadena.charAt(i)==',') 
					numcomas++;

		return numcomas;			
	}

	


}