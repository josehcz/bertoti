public class Vip_2 implements Observer{
	
    public void update(double saldo,String usuario,String inventario[]){
		
		display(saldo, usuario, inventario);
		
	}
	
	public void display(double s,String u, String i[]){
		
		System.out.println("Bem vindo: "+u);
		System.out.println("Seu nivel Vip é: "+s);
        System.out.println("Você acaba de receber:\nUm kit de poção inicial;\nPedras de melhorias");
        System.out.println("Você tem no inventario agora:\n"+i);
    }

}
