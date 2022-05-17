package Composite;


import java.util.ArrayList;
import java.util.List;


// É nossa estrutura de concreto.
// Corresponde à parte composta do diagrama UML.
// Mantém a lista de Componentes (ICatalogComponent).
public class ProductCatalog implements ICatalogComponent {
    private String _name;

    private List<ICatalogComponent> _components;

    public ProductCatalog(String name) {
        _name = name;
        _components = new ArrayList<ICatalogComponent>();
    }

    public void add(ICatalogComponent catalogComponent) {
        _components.add(catalogComponent);
    }

    public void remove(ICatalogComponent catalogComponent) {
        _components.remove(catalogComponent);
    }

    public void drawHierarchy() {
        System.out.println(_name);
        for (ICatalogComponent component : _components) {
            component.drawHierarchy();
        }
    }
}