public class Main{
    public static void main(String[] args) {
        
        Cliente teste = new Cliente ("jose", "Mag", "Cachorro", "Pastor", "Banho");

        Controle controle = new Controle();

        controle.controle(teste);

    }
}