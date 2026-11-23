public class Admin extends User {
    public Admin(String username) { super(username); }
    @Override public void showDashboard() {
        System.out.println("\nWelcome, " + getUsername() + " (Administrator)");
        System.out.println("Inventory Management Dashboard");
    }
}
