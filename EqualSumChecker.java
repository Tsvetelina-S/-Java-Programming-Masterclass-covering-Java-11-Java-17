package CoddingExercises_01;

public class EqualSumChecker {
    public static void main(String[] args) {

        //EXAMPLES OF INPUT/OUTPUT:
        //* hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1
        //* hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2
        //* hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0

        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));

    }
    public static boolean hasEqualSum(int sum1, int sum2, int sum3) {
        if (sum1 + sum2 == sum3) {
            return true;
        }
        return false;
    }
}
