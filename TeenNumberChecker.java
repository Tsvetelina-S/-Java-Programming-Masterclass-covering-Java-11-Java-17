package CoddingExercises_01;

public class TeenNumberChecker {
    public static void main(String[] args) {

        //EXAMPLES OF INPUT/OUTPUT:
        //* hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
        //* hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
        //* hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19

        //Write another method named isTeen with 1 parameter of type int.
        //The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive).
        // Otherwise return false.
        
        //EXAMPLES OF INPUT/OUTPUT:
        //* isTeen(9);  should return false since 9 is in not range 13 - 19
        //* isTeen(13);  should return true since 13 is in range 13 - 19

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));


    }
    public static boolean hasTeen (int number1,int number2, int number3){
        if (number1 >= 13 && number1 <=19 || number2 >=13 && number2 <=19 || number3 >=13 && number3 <= 19){
            return true;
        }
        return false;
    }

    public static boolean isTeen ( int number4){
        if (number4 >=13 && number4 <=19){
            return true;
        }
        return false;
    }
}
