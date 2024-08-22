public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int empType = (int) (Math.random() * 3);
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int dailyWage = 0;

        switch (empType) {
            case 1:
                dailyWage = wagePerHour * fullDayHour;
                System.out.println("Employee is Present (Full-time)");
                break;
            case 2:
                dailyWage = wagePerHour * partTimeHour;
                System.out.println("Employee is Present (Part-time)");
                break;
            default:
                System.out.println("Employee is Absent");
                break;
        }
        System.out.println("Daily Wage: " + dailyWage);
    }

}