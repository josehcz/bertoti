import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		Banco b = new Banco();
		Vip_1 vip_1 = new Vip_1();
		Vip_2 vip_2 = new Vip_2();
		b.registerObserver(vip_1);
        b.registerObserver(vip_2);
        
        List<String> inventario;


        
		Usuario User1 = new Usuario(1.0, "User1", inventario);
		
		User1.Vip = b.PromoVip_2(200.0, User1);
		
		
		
		
	}
}
