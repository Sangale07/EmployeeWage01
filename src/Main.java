public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int isPresent = (int) (Math.random() * 2);
        int wagePerHour = 20;
        int fullDayHour = 8;

        if (isPresent == 1) {
            int dailyWage = wagePerHour * fullDayHour;
            System.out.println("Employee is Present");
            System.out.println("Daily Wage: " + dailyWage);
        } else {
            System.out.println("Employee is Absent");
            System.out.println("Daily Wage: 0");
        }
    }
}