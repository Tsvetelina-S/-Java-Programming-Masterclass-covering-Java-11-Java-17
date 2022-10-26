package CoddingExercises_02;

public class EvenDigitSum {
    public static void main(String[] args) {
        //* getEvenDigitSum(123456789); should return 20
        //* getEvenDigitSum(252); → should return 4
        //* getEvenDigitSum(-22); → should return -1

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }
    public static int getEvenDigitSum (int number){
        if (number < 0){
            return -1;
        }
        int digit = 0;
        int remainder= 0;
        while (number >0) {
            remainder = number % 10;
            if (remainder % 2 == 0) {
                digit += remainder;
            }
            number /=10;
        }
        return digit;
    }
}
