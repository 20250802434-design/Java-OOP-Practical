public interface Manageable {
    void addProduct(Product product);
    boolean removeProduct(int id);
    Product findProduct(int id);
    void displayProducts();
}
