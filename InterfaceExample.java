interface Printable { void print(); }
class Report implements Printable {
    public void print() { System.out.println("Printing the annual report."); }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Printable p = new Report();
        p.print();
    }
}
