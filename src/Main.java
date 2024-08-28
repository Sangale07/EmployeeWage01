import java.util.Random;

class EmployeeWage {
    public final int IS_PART_TIME = 1;
    public final int IS_FULL_TIME = 2;

    // Method to calculate employee wage
    public void calculateEmpWage(String companyName, int wagePerHrs, int maxWorkingDays, int maxWorkingHrs) {
        int empHrs;
        int totalEmpHrs = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs < maxWorkingHrs && totalWorkingDays < maxWorkingDays) {
            Random random = new Random();
            int empCheck = random.nextInt(3);

            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
                    break;
            }

            totalEmpHrs += empHrs;
            totalEmpWage += empHrs * wagePerHrs;
            totalWorkingDays++;
        }

        totalEmpWage = totalEmpHrs * wagePerHrs;
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHrs, maxWorkingDays, maxWorkingHrs);
        companyEmpWage.setTotalEmpWage(totalEmpWage);

        System.out.println("Total Wage for Company: " + companyEmpWage);
        System.out.println("Total Working Hrs: " + totalEmpHrs);
    }
}
