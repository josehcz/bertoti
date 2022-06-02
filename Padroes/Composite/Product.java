package Composite;

class Product implements ICatalogComponent {
    private String _name;

    public Product(String name) {
        _name = name;
    }

    public void drawHierarchy() {
        System.out.println(_name);
    }
}
