package CoddingExercises_02;

public class SumOdd {
    public static void main(String[] args) {
        //*sumOdd(1, 100); → should return 2500
        //* sumOdd(-1, 100); →  should return -1
        //* sumOdd(100, 100); → should return 0
        //* sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
        //* sumOdd(100, -100); → should return -1
        //* sumOdd(100, 1000); → should return 247500

        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }
    public static boolean isOdd (int number){
        return (number > 0) && (number % 2 != 0);
    }
    public static int sumOdd (int start, int end) {
        if ((end < start) || (start < 0)){
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

}
