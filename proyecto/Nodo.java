

public class Nodo{
	private String info;
	private Nodo ligaDer;

	//Constructor
	public Nodo(String dato, Nodo ld){
		info= dato;
		ligaDer= ld;
	}

	//Metodos
	public void SetInfo(String dato){
		info= dato;
	}

	public void SetLigaDer(Nodo ld){
		ligaDer= ld;
	}

	public String GetInfo(){
		return info;
	}

	public Nodo GetLigaDer(){
		return ligaDer;
	}
}