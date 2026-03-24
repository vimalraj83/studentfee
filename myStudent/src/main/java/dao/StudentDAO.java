package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.Student;
import util.DBConnection;

public class StudentDAO {

    // INSERT
    public void addStudent(Student s) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "insert into student values(?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, s.getStudentId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getDepartment());

            ps.executeUpdate();

            System.out.println("Student Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void updateStudent(Student s) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "update student set name=?, department=? where student_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, s.getName());
            ps.setString(2, s.getDepartment());
            ps.setInt(3, s.getStudentId());

            ps.executeUpdate();

            System.out.println("Student Updated Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteStudent(int id) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "delete from student where student_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Student Deleted Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ
    public void getStudent(int id) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "select * from student where student_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println("ID: " + rs.getInt(1));
                System.out.println("Name: " + rs.getString(2));
                System.out.println("Department: " + rs.getString(3));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
