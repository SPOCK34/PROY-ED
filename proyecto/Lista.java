import java.util.StringTokenizer;
public class Lista{
	private Nodo H;
	private Nodo T;
	
	public void Insertar(String dato){
		Nodo q= new Nodo (dato, null);
		if (T== null)
			H=q;
		else
			T.SetLigaDer(q);
		T=q;
	}


	public void Listar(){
            Nodo q;
            for (q= H; q!= null; q=q.GetLigaDer())
		System.out.println(q.GetInfo());
	}
	public void Codificar(){
		    Nodo q;
		    String aux;
            for (q= H; q!= null; q=q.GetLigaDer())
            {
            	aux=q.GetInfo();
            	q.SetInfo(Remplazapremisa(aux));
            }
	}
	public void SeparaComas(String p)
	{

	}
	public void SeparaEins(String p)
	{
		p=p.replace("->","1");
		p=p.replace("<->","1");
		String []cadena = p.split(aux);
	}
	public String Remplazapremisa(String cadena)
	{	

		cadena= cadena.replace(" si y solo si "," <-> ");
		cadena= cadena.replace(" pero "," ^ ");
		cadena= cadena.replace(" sin embargo "," ^ ");
		cadena= cadena.replace(" entonces "," -> ");
		cadena= cadena.replace(" o "," v ");
		cadena= cadena.replace(" y "," ^ ");
		cadena= cadena.replace(" no "," ¬ ");
		cadena= cadena.replace(" por lo tanto, "," C: ");
      
		return cadena;

	}
}