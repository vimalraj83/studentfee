package service;
import dao.StudentDAO;
import entity.Student;

public class StudentService {

    StudentDAO dao = new StudentDAO();

    public void addStudent(int id, String name, String dept) {

        Student s = new Student(id, name, dept);
        dao.addStudent(s);
    }

    public void updateStudent(int id, String name, String dept) {

        Student s = new Student(id, name, dept);
        dao.updateStudent(s);
    }

    public void deleteStudent(int id) {
        dao.deleteStudent(id);
    }

    public void getStudent(int id) {
        dao.getStudent(id);
    }
}
