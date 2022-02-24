import java.util.ArrayList;


public class Banco implements Subject{
	
	private ArrayList observers;
	private Usuario c;
	
	public Banco(){
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers(double Vip, String nome, String inventario[]){
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(Vip, nome,inventario);
		}
	}
	
	public String bonus(Usuario c, double vip){
		
		c.inventario.add("");
		
		notifyObservers(c.saldo);
		return c.saldo;
		
	}

}
