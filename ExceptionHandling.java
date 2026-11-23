public class ExceptionHandling {
    public static void main(String[] args) {
        int numerator = 20, denominator = 0;
        try {
            System.out.println(numerator / denominator);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
