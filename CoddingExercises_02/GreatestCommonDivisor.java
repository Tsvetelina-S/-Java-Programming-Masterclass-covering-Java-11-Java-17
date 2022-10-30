package CoddingExercises_02;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        //* getGreatestCommonDivisor(25, 15); should return 5
        //* getGreatestCommonDivisor(12, 30); should return 6
        //* getGreatestCommonDivisor(9, 18); should return -1
        //* getGreatestCommonDivisor(81, 153); should return 9

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int divisor2 = first;
        while (divisor2 >0) {
            if ((first % divisor2 == 0) && (second % divisor2 == 0)) {
                return divisor2;
            }
            divisor2--;
        }
        return -1;
    }
}
