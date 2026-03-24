package main;
import java.util.Scanner;

import service.StudentService;
import service.FeeService;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService ss = new StudentService();
        FeeService fs = new FeeService();

        while (true) {

            System.out.println("\n==== STUDENT FEES MANAGEMENT ====");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Add Fee");
            System.out.println("6. View Fee");
            System.out.println("7. Delete Fee");
            System.out.println("8. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Name:");
                    String name = sc.nextLine();

                    System.out.println("Enter Department:");
                    String dept = sc.nextLine();

                    ss.addStudent(id, name, dept);
                    break;

                case 2:
                    System.out.println("Enter Student ID:");
                    ss.getStudent(sc.nextInt());
                    break;

                case 3:
                    System.out.println("Enter ID:");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter New Name:");
                    String uname = sc.nextLine();

                    System.out.println("Enter New Department:");
                    String udept = sc.nextLine();

                    ss.updateStudent(uid, uname, udept);
                    break;

                case 4:
                    System.out.println("Enter ID:");
                    ss.deleteStudent(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Enter Fee ID:");
                    int fid = sc.nextInt();

                    System.out.println("Enter Student ID:");
                    int sid = sc.nextInt();

                    System.out.println("Enter Amount:");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Enter Status (Paid / Pending):");
                    String status = sc.nextLine();

                    fs.addFee(fid, sid, amount, status);
                    break;

                case 6:
                    System.out.println("Enter Student ID:");
                    fs.getFee(sc.nextInt());
                    break;

                case 7:
                    System.out.println("Enter Fee ID:");
                    fs.deleteFee(sc.nextInt());
                    break;

                case 8:
                    System.exit(0);
            }
        }
    }
}
