import java.util.ArrayList;
import java.util.List;

class InvalidStockException extends Exception {
    public InvalidStockException(String message) { super(message); }
}

class StockValidator {
    static void validate(int quantity) throws InvalidStockException {
        if (quantity < 0) throw new InvalidStockException("Stock quantity cannot be negative.");
        System.out.println("Valid stock quantity: " + quantity);
    }
}

class ReportTask extends Thread {
    private final String reportName;
    ReportTask(String reportName) { this.reportName = reportName; }
    @Override public void run() {
        System.out.println(Thread.currentThread().getName() + " is generating " + reportName);
        try { Thread.sleep(500); }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Report task interrupted.");
            return;
        }
        System.out.println(reportName + " generated.");
    }
}

public class AdvancedJavaDemo {
    public static void main(String[] args) {
        // Exception handling and custom exception
        try {
            StockValidator.validate(12);
            StockValidator.validate(-3);
        } catch (InvalidStockException e) {
            System.out.println("Validation error: " + e.getMessage());
        }

        // Collections framework
        List<String> products = new ArrayList<>();
        products.add("Keyboard");
        products.add("Mouse");
        products.add("Monitor");
        System.out.println("Products in collection: " + products);

        // Multithreading
        ReportTask task1 = new ReportTask("Stock Summary");
        ReportTask task2 = new ReportTask("Low Stock");
        task1.start();
        task2.start();
        try {
            task1.join();
            task2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted.");
        }
    }
}
