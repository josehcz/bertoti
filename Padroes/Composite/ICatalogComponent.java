package Composite;

// É nossa estrutura abstrata.
// Corresponde à parte Componente no diagrama UML.
// Outras classes de cliente implementam esta construção.
// Contém o método de desenhar a hierarquia que outras classes implementarão.
public interface ICatalogComponent {
    void drawHierarchy();
}
