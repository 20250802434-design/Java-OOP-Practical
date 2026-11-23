public abstract class User {
    private final String username;
    protected User(String username) { this.username = username; }
    public String getUsername() { return username; }
    public abstract void showDashboard();
}
