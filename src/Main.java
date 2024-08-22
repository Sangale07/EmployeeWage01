import java.util.*;
public class Main {
    public static void main(String[] args) {
        EmployeeWage ew1 = new EmployeeWage();
        EmployeeWage ew2 = new EmployeeWage();
        System.out.println("JIo");
        ew1.calculateEmpWage("Jio", 20, 24, 100);
        System.out.println("-----------------------------------------");
        System.out.println("Reliance");
        ew2.calculateEmpWage("Reliance", 20, 25, 110);


    }
}
class EmployeeWage {
    public final int IS_PART_TIME = 1;
    public final int IS_FULL_TIME = 2;

    public void calculateEmpWage(String companyName,int wagePerHrs,int numOfWorkingDays,int numOfWorkingHrs) {
        int empHrs;
        int totalEmpHrs = 0;
        int totalEmpWage=0;
        int totalWorkingDays=0;

        while (totalEmpHrs <= numOfWorkingHrs && totalWorkingDays <= numOfWorkingDays) {
            Random random = new Random();
            // Generate a random 0 ,1 or 2
            int empCheck = random.nextInt(3);

            switch ((int) empCheck) {
                case IS_PART_TIME:
                    System.out.println("Employee is Present as PART TIME");
                    empHrs = 4;
                    totalEmpHrs += empHrs;
                    totalEmpWage+=empHrs*wagePerHrs;
                    System.out.println("Total Wage :"+totalEmpWage);
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is Present as FULL TIME");
                    empHrs = 8;
                    totalEmpHrs += empHrs;
                    totalEmpWage+=empHrs*wagePerHrs;
                    System.out.println("Total Wage :"+totalEmpWage);
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
                    totalEmpHrs += empHrs;
                    totalEmpWage+=empHrs*wagePerHrs;
                    System.out.println("Total Wage :"+totalEmpWage);
                    break;
            }
            totalWorkingDays++;
            totalEmpWage++;
            System.out.println("Day No :" + totalWorkingDays + " Emp Hrs: " + empHrs);
        }
        totalEmpWage = totalEmpHrs * wagePerHrs;
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHrs, numOfWorkingDays, numOfWorkingHrs);
        companyEmpWage.setTotalEmpWage(totalEmpWage);

        System.out.println("Total Wage for Company: " + companyEmpWage);
        System.out.println("Total Working Hrs for  :"+totalEmpHrs);
    }

}









