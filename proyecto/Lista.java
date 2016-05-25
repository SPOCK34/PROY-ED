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

	public Nodo GetNodoH()
	{
		return H;
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
	
	public String Remplazapremisa(String cadena)
	{	

		cadena= cadena.replace(" SI Y SOLO SI "," 1 ");
		cadena= cadena.replace(" PERO ","^");
		cadena= cadena.replace(" SIN EMBARGO ","^");
		cadena= cadena.replace(" ENTONCES ","2");
		cadena= cadena.replace(" O "," v ");
		cadena= cadena.replace(" Y "," ^ ");
		cadena= cadena.replace(" NO ES VERDAD QUE","0");
		//cadena= cadena.replace(" NO ","0");
		cadena= cadena.replace(" POR LO TANTO, ","3");
      
		return cadena;

	}
}