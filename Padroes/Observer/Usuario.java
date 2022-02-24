import java.util.*;
public class Usuario {
	
	public double Vip;
	public String nome;
	public List<String> inventario = new ArrayList<String>();;
	
	public Usuario(double v, String n, List<String> c){
		Vip = v;
		nome =n;
		inventario = c;
	}

}
