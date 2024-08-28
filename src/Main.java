import java.util.*;

public class Main {
    public static void main(String[] args) {
        EmployeeWage ew1 = new EmployeeWage();
        EmployeeWage ew2 = new EmployeeWage();
        System.out.println("JIo");
        ew1.calculateEmpWage("Jio", 20, 24, 100);  // Parameters: (companyName, wagePerHrs, maxWorkingDays, maxWorkingHrs)
        System.out.println("-----------------------------------------");
        System.out.println("Reliance");
        ew2.calculateEmpWage("Reliance", 20, 25, 110); // Parameters: (companyName, wagePerHrs, maxWorkingDays, maxWorkingHrs)
    }
}

class EmployeeWage {
    public final int IS_PART_TIME = 1;
    public final int IS_FULL_TIME = 2;

    public void calculateEmpWage(String companyName, int wagePerHrs, int maxWorkingDays, int maxWorkingHrs) {
        int empHrs;
        int totalEmpHrs = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;

        // Loop until the maximum working hours or days are reached
        while (totalEmpHrs < maxWorkingHrs && totalWorkingDays < maxWorkingDays) {
            Random random = new Random();
            int empCheck = random.nextInt(3);

            switch (empCheck) {
                case IS_PART_TIME:
                    System.out.println("Employee is Present as PART TIME");
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is Present as FULL TIME");
                    empHrs = 8;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
                    break;
            }

            totalEmpHrs += empHrs;
            totalEmpWage += empHrs * wagePerHrs;
            totalWorkingDays++;

            System.out.println("Day No: " + totalWorkingDays + " Emp Hrs: " + empHrs + " Total Wage: " + totalEmpWage);

            // Check if we've reached the maximum hours or days limit
            if (totalEmpHrs >= maxWorkingHrs || totalWorkingDays >= maxWorkingDays) {
                break;
            }
        }

        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHrs, maxWorkingDays, maxWorkingHrs);
        companyEmpWage.setTotalEmpWage(totalEmpWage);

        System.out.println("Total Wage for Company: " + companyEmpWage);
        System.out.println("Total Working Hrs: " + totalEmpHrs);
        System.out.println("Total Working Days: " + totalWorkingDays);
    }
}
