package CoddingExercises_02;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {

        //sumFirstAndLastDigit(252); → should return 4
        //* sumFirstAndLastDigit(257); → should return 9
        //* sumFirstAndLastDigit(0); → should return 0
        //* sumFirstAndLastDigit(5); → should return 10
        //* sumFirstAndLastDigit(-10); → should return -1

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }

    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }
        int lastD = number % 10;
        while (number > 9) {
            number = number / 10;
        }
        return number + lastD;
    }
}
