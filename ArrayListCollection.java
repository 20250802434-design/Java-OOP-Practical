import java.util.ArrayList;
public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Java");
        subjects.add("DBMS");
        subjects.add("Computer Networks");
        for (String subject : subjects) System.out.println(subject);
        subjects.remove("DBMS");
        System.out.println("After removal: " + subjects);
    }
}
