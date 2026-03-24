package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.Fee;
import util.DBConnection;

public class FeeDAO {

    public void addFee(Fee f) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "insert into fee values(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, f.getFeeId());
            ps.setInt(2, f.getStudentId());
            ps.setDouble(3, f.getAmount());
            ps.setString(4, f.getStatus());

            ps.executeUpdate();

            System.out.println("Fee Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getFee(int studentId) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "select * from fee where student_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, studentId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println("Fee ID: " + rs.getInt(1));
                System.out.println("Student ID: " + rs.getInt(2));
                System.out.println("Amount: " + rs.getDouble(3));
                System.out.println("Status: " + rs.getString(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteFee(int feeId) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "delete from fee where fee_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, feeId);

            ps.executeUpdate();

            System.out.println("Fee Deleted Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
