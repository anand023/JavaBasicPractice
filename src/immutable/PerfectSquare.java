package immutable;

public class PerfectSquare {
    public static void main(String[] args) {

    }

    //user-defined method that checks the number is perfect square or not
    static boolean checkPerfectSquare(double number) {
        //calculating the square root of the given number
        double sqrt = Math.sqrt(number);
        //finds the floor value of the square root and comparing it with zero
        return ((sqrt - Math.floor(sqrt)) == 0);
    }
}
