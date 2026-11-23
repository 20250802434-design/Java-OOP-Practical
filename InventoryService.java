import java.util.ArrayList;
import java.util.List;

public class InventoryService implements Manageable {
    private final List<Product> products = new ArrayList<>();

    @Override public void addProduct(Product product) {
        if (findProduct(product.getId()) != null) throw new IllegalArgumentException("Product ID already exists.");
        products.add(product);
    }
    @Override public boolean removeProduct(int id) {
        Product p = findProduct(id);
        return p != null && products.remove(p);
    }
    @Override public Product findProduct(int id) {
        for (Product p : products) if (p.getId() == id) return p;
        return null;
    }
    @Override public void displayProducts() {
        if (products.isEmpty()) { System.out.println("Inventory is empty."); return; }
        System.out.println("\nID | Name | Category | Quantity | Price");
        for (Product p : products) System.out.println(p);
    }
    public boolean updateQuantity(int id, int quantity) {
        Product p = findProduct(id);
        if (p == null) return false;
        p.setQuantity(quantity);
        return true;
    }
}
