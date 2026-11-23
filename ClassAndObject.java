class Student {
    String name;
    int rollNo;
    Student(String name, int rollNo) { this.name = name; this.rollNo = rollNo; }
    void display() { System.out.println("Name: " + name + ", Roll No: " + rollNo); }
}
public class ClassAndObject {
    public static void main(String[] args) {
        Student s = new Student("Parth", 1);
        s.display();
    }
}
