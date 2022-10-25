package CoddingExercises_01;

public class AreaCalculator {
    public static void main(String[] args) {

        //area(5.0); should return 78.53975
        //* area(-1);  should return -1 since the parameter is negative
        //* area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
        //* area(-1.0, 4.0);  should return -1 since first the parameter is negative

        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

    }
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        double areaOfACircle = (radius * radius * Math.PI);
        return areaOfACircle;
    }
    public static double area (double x, double y){
        if (x<0 || y<0){
            return -1;
        }
        double areaOfRectangle = (x * y);
        return areaOfRectangle;
    }
}
