import Entity.Student;
import Entity.StudentDAO;

public class App2 {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        Student student = new Student();
        student.setName("John Doe");
        student.setAge(25);
        student.setEmail("john.doe@example.com");
        dao.createStudent(student);

        Student retrievedStudent = dao.getStudentById(1);
        System.out.println("Succes " + retrievedStudent.getName());

        dao.deleteStudentById(1);
    }
}
