import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation program");
        EmployeeWage ew1=new EmployeeWage();
        ew1.isPresent();

    }
}
class EmployeeWage {

    public void isPresent() {
        Random random = new Random();
        // Generate a random number (0 or 1)
        int attendance = random.nextInt(2);

        // Check if the employee is present or absent
        if (attendance == 0) {
            System.out.println("Employee is absent.");
        } else {
            System.out.println("Employee is present.");
        }
    }
}









