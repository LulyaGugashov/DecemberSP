package rd.epam.com;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList();

        Student student = new Student("Сергей", "Михайлович");
        student.setGroup(Group.FIRST);
        student.setSecondName("Лукашов");

        students.add(student);
        students.forEach(System.out::println);
    }
}
