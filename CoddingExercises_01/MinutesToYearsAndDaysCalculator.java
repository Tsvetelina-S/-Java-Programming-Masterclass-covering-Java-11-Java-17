package CoddingExercises_01;

public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        // printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
        //* printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
        //* printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }

    }

}
