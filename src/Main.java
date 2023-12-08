import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Marco", 23);
        Student student2 = new Student("Gaia", 24);
        Student student3 = new Student("Ugo", 20);
        Student student4 = new Student("Mario", 24);
        Student student5 = new Student("Clara", 22);
        Student student6 = new Student("Maria", 21);
        Student student7 = new Student("Rocco", 27);
        Student student8 = new Student("Giada", 29);
        Student student9 = new Student("Pio", 20);
        Student student10 = new Student("Marcello", 21);
        Student student11 = new Student("Claudia", 22);
        Student student12 = new Student("Marta", 21);
        List<Student> students = new ArrayList<>(Arrays.asList(student1,student2,student3,student4,student5,student6,student7,student8,student9,student10,student11,student12));
        System.out.println(students);
        students.sort(Comparator.comparing(Student::getName));
        System.out.println(students);
    }
}
