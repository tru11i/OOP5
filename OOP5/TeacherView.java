package OOP5;

// TeacherView (Презентер)
import java.util.List;

public class TeacherView {
    public void displayTeacher(Teacher teacher) {
        System.out.println("Teacher Information:");
        System.out.println("Name: " + teacher.getName());
        System.out.println("Subject: " + teacher.getSubject());
        System.out.println("Experience: " + teacher.getExperience() + " years");
        System.out.println("--------------");
    }

    public void displayTeachers(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            displayTeacher(teacher);
        }
    }
}
