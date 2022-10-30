package CoddingExercises_02;

public class LastDigitChecker {
    public static void main(String[] args) {

        //* hasSameLastDigit (41, 22, 71); → should return true
        //* hasSameLastDigit (23, 32, 42); → should return true
        //* hasSameLastDigit (9, 99, 999); → should return false

        //* isValid(10); → should return true
        //* isValid(468); → should return true
        //* isValid(1051); → should return false

        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 99, 999));

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));

    }
    public static boolean hasSameLastDigit (int number1, int number2, int number3){
        if(number1 < 10 || number1 > 1000 || number2 < 10 || number2 >1000 || number3 < 10 || number3 > 1000){
            return false;
        }
        int lastD1 = number1;
        int lastD2 = number2;
        int lastD3 = number3;
        lastD1= number1 % 10; //1
        lastD2= number2 % 10; // 2
        lastD3 = number3 % 10; // 1
        return lastD1 == lastD2 || lastD1 == lastD3 || lastD2 == lastD3;
    }

    public static boolean  isValid (int parameter){
        return parameter >= 10 && parameter <= 1000; //само ако
    }
}
