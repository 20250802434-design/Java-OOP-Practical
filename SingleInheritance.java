class Person {
    void introduce() { System.out.println("I am a person."); }
}
class Teacher extends Person {
    void teach() { System.out.println("I teach Java."); }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.introduce();
        t.teach();
    }
}
