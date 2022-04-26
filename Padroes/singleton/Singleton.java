package singleton;

public class Singleton {
	
	private static Singleton instance;
	
	private String greet;
	
	private Singleton(){
		this.greet = "Ola, Eu sou um Singleton";
	};

	public static synchronized Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
	public void greet(){
		System.out.println(instance.greet);
	}
}
