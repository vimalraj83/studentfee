package entity;
public class Fee {

    private int feeId;
    private int studentId;
    private double amount;
    private String status;

    public Fee() {}

    public Fee(int feeId, int studentId, double amount, String status) {
        this.feeId = feeId;
        this.studentId = studentId;
        this.amount = amount;
        this.status = status;
    }

    public int getFeeId() {
        return feeId;
    }

    public void setFeeId(int feeId) {
        this.feeId = feeId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}