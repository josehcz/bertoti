package singleton;

import singleton.Singleton;;

public class Demo {
	
	public static void main(String[] args){
		System.out.println("Demonstração do singleton pattern");
		System.out.println("Pegando a referencia da instacia Singleton");
		Singleton singleton = Singleton.getInstance();
		singleton.greet();
		System.out.println("Pegando outra referencia da instacia Singleton");
		Singleton outroSingleton = Singleton.getInstance();
		outroSingleton.greet();
		System.out.println("Checando se as duas referencias sao a mesma coisa");
		if(singleton == outroSingleton){
			System.out.println("True");
		}
		else{
			System.out.println("False");			
		}	
	}
}
