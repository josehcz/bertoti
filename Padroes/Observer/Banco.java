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
	
	public void notifyObservers(Double Vip){
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(Vip);
		}
	}
	
	public Double PromoVip_2(Double v,Usuario u){
		
		c.Vip = 2.0;
		
		notifyObservers(c.Vip);
		return c.Vip;
		
	}

}
