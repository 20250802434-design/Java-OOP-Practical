import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin("admin");
        InventoryService inventory = new InventoryService();
        admin.showDashboard();

        boolean running = true;
        while (running) {
            System.out.println("\n1 Add  2 View  3 Search  4 Update Quantity  5 Delete  0 Exit");
            System.out.print("Choose: ");
            String choice = sc.nextLine().trim();
            try {
                switch (choice) {
                    case "1":
                        System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
                        System.out.print("Name: "); String name = sc.nextLine();
                        System.out.print("Category: "); String category = sc.nextLine();
                        System.out.print("Quantity: "); int qty = Integer.parseInt(sc.nextLine());
                        System.out.print("Price: "); double price = Double.parseDouble(sc.nextLine());
                        inventory.addProduct(new Product(id, name, category, qty, price));
                        System.out.println("Product added.");
                        break;
                    case "2": inventory.displayProducts(); break;
                    case "3":
                        System.out.print("Product ID: ");
                        Product found = inventory.findProduct(Integer.parseInt(sc.nextLine()));
                        System.out.println(found == null ? "Product not found." : found);
                        break;
                    case "4":
                        System.out.print("Product ID: "); int updateId = Integer.parseInt(sc.nextLine());
                        System.out.print("New quantity: "); int newQty = Integer.parseInt(sc.nextLine());
                        System.out.println(inventory.updateQuantity(updateId, newQty) ? "Quantity updated." : "Product not found.");
                        break;
                    case "5":
                        System.out.print("Product ID: ");
                        System.out.println(inventory.removeProduct(Integer.parseInt(sc.nextLine())) ? "Product deleted." : "Product not found.");
                        break;
                    case "0": running = false; break;
                    default: System.out.println("Invalid menu choice.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
        System.out.println("Thank you. Application closed.");
    }
}
