package OOP5;

// Пример использования в методе main
public class Main {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherService, teacherView);

        teacherController.createTeacher("John Doe", "Math", 5);
        teacherController.createTeacher("Jane Smith", "History", 8);

        teacherController.displayAllTeachers();
    }
}