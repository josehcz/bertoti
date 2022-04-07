public class Controle
{    
    Banho_Tosa bt = new Banho_Tosa();
    Banho banho = new Banho();
    Passeio passeio = new Passeio();
    Tosa tosa = new Tosa();

    public controle(Cliente cliente)
    {
        switch (cliente.pedido)
        {
            case "Banho":
                banho.banho();
            case "Banho_Tosa":
                bt.baho_tosa();
            case "Passeio":
                passeio.passeio();
            case "Tosa":
                tosa.tosa();
        }

    }
}