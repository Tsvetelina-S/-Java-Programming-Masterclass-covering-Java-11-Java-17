package CoddingExercises_02;

public class NumberPalindrome {
    public static void main(String[] args) {
        //isPalindrome(-1221); → should return true
        //isPalindrome(707); → should return true
        //isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }
    public static boolean isPalindrome (int number) {
        int number1 = number;
        int reverse = 0;
        int lastDigit = 0;
        while (number1 != 0) {
            lastDigit = number1 % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number1 = number1 / 10;

        }
        return number == reverse;
    }
}
