public class Product {
    private final int id;
    private String name;
    private String category;
    private int quantity;
    private double price;

    public Product(int id, String name, String category, int quantity, double price) {
        if (id <= 0 || quantity < 0 || price < 0) throw new IllegalArgumentException("Invalid product details.");
        this.id = id; this.name = name; this.category = category;
        this.quantity = quantity; this.price = price;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public void setName(String name) { this.name = name; }
    public void setCategory(String category) { this.category = category; }
    public void setQuantity(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative.");
        this.quantity = quantity;
    }
    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative.");
        this.price = price;
    }
    @Override public String toString() {
        return id + " | " + name + " | " + category + " | Qty: " + quantity + " | Price: " + price;
    }
}
