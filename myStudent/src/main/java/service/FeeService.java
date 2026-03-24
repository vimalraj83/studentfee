package service;
import dao.FeeDAO;
import entity.Fee;

public class FeeService {

    FeeDAO dao = new FeeDAO();

    public void addFee(int feeId, int studentId, double amount, String status) {

        Fee f = new Fee(feeId, studentId, amount, status);
        dao.addFee(f);
    }

    public void getFee(int studentId) {
        dao.getFee(studentId);
    }

    public void deleteFee(int feeId) {
        dao.deleteFee(feeId);
    }
}
