package Composite;

public class App {
    public static void main(String[] args) {
        ProductCatalog items = new ProductCatalog("Produtos");

        ProductCatalog phones = new ProductCatalog("telefones");

        ProductCatalog iPhone = new ProductCatalog("iPhone telefone");
        ProductCatalog samsung = new ProductCatalog("Samsung Telefone");

        Product iphone5Item = new Product("iPhone 5 Telefone");
        Product samsungGalaxyItem = new Product("Samsung Galaxy Telefone");

        // Adicionando um nó de telefone à hierarquia superior.
        items.add(phones);

        // Adicionando nós Samsung e iPhone à hierarquia do telefone.
        phones.add(iPhone);
        phones.add(samsung);

        // Adicionando folha iPhone5 (é a estrutura mais baixa, não contém um nó) à hierarquia do iPhone.
        iPhone.add(iphone5Item);

        // Adicionando uma folha Samsung Galaxy (é a estrutura mais baixa, não contém um nó) à hierarquia Samsung.

        samsung.add(samsungGalaxyItem);

        items.drawHierarchy();

        //             -produtor
        //             --Telefones
        //             ---iPhone Telefone
        //             ----iPhone 5 Telefone
        //             --Samsung Telefone
        //             ---Samsung Galaxy Telefone

    }
}
