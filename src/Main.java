public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int totalWage = 0;
        int workingDays = 20;

        for (int day = 1; day <= workingDays; day++) {
            int empType = (int) (Math.random() * 3);
            int dailyWage = 0;

            switch (empType) {
                case 1:
                    dailyWage = wagePerHour * fullDayHour;
                    break;
                case 2:
                    dailyWage = wagePerHour * partTimeHour;
                    break;
                default:
                    dailyWage = 0;
                    break;
            }
            totalWage += dailyWage;
            System.out.println("Day " + day + ": Daily Wage: " + dailyWage);
        }
        System.out.println("Total Wage for the Month: " + totalWage);
    }
}