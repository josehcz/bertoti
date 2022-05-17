package Composite;

// É nossa estrutura de concreto.
// Corresponde à parte Leaf no diagrama UML.
// Representa a camada mais baixa da hierarquia.

class Product implements ICatalogComponent {
    private String _name;

    public Product(String name) {
        _name = name;
    }

    public void drawHierarchy() {
        System.out.println(_name);
    }
}
