package CoddingExercises_02;

public class SharedDigit {

    public static void main(String[] args) {

//* hasSharedDigit(12, 23); → should return true
//* hasSharedDigit(9, 99); → should return false
//* hasSharedDigit(15, 55); → should return true

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
    public static boolean hasSharedDigit (int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }
        int num1 = number1;
        int num2 = number2;
        int digit22= 0;

        while (number1 > 0) {
            num1 = number1 % 10;//2,1
            num2 = number2 % 10; //3,4
            number1 /= 10;
            number2 /= 10;
            digit22 = number2; //4,3
            if (num1 == num2 || num1 == digit22) {
                return true;
            }
        }
        return false;
    }
}
