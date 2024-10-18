//Glenn Cheruvathur
//CSS143B 
public class CustomMath {
    public static final double PI = 3.141592653589793;
    public static final double E = 2.718281828459045;

    // Why is it safe to make these variables public?
    // Because they are constants (final), their values cannot be changed.
    
    // How do you access these variables from another class?
    // You access them using CustomMath.PI and CustomMath.E.

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static int pow(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static int abs(int a) {
        return (a < 0) ? -a : a;
    }

    // Method to calculate the square root of an integer
    public static double sqrt(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(value);
    }
}
