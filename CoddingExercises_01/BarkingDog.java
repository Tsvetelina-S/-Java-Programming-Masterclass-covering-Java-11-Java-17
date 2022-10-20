package CoddingExercises_01;

public class BarkingDog {
    public static void main(String[] args) {

        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));

        //* shouldWakeUp (true, 1); → should return true
        //
        //* shouldWakeUp (false, 2); → should return false since the dog is not barking.
        //
        //* shouldWakeUp (true, 8); → should return false, since it's not before 8.
        //
        //* shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean getUp = false;
        if (barking) {
            if ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay == 23)) {
                getUp = true;
            }
        }
        return getUp;
    }
}
