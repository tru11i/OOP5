package OOP5;

// TeacherController (Контроллер)
import java.util.Scanner;
import java.util.List;

public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;
    private Scanner scanner;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
        this.scanner = new Scanner(System.in);
    }

    public void createTeacher(String name, String subject, int experience) {
        Teacher newTeacher = new Teacher(name, subject, experience);
        teacherService.addTeacher(newTeacher);
    }

    public void editTeacher(int index, String name, String subject, int experience) {
        Teacher updatedTeacher = new Teacher(name, subject, experience);
        teacherService.editTeacher(index, updatedTeacher);
    }

    public void displayAllTeachers() {
        List<Teacher> teachers = teacherService.getAllTeachers();
        teacherView.displayTeachers(teachers);
    }
    
    // Дополнительные методы для взаимодействия с пользователем
}

// Teacher (Класс, преподаватель)
class Teacher {
    private String name;
    private String subject;
    private int experience;

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getExperience() {
        return experience;
    }
}
