//Glenn Cheruvathur
//CSS143B 
public class Fraction {
    public final int numerator;
    public final int denominator;

    // Parameterized constructor
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }
    // Why not define a no-argument constructor:
    // The class invariant states that the denominator should never be zero. 
    // Without arguments, a no-argument constructor wouldn't be able to set these values, potentially leading to an invalid fraction.

    // Copy constructor
    public Fraction(Fraction other) {
        this.numerator = other.numerator;
        this.denominator = other.denominator;
    }

    // Helper method to calculate GCD
    private int gcd(int a, int b) {
        if (b == 0) {
            return CustomMath.abs(a);
        }
        return gcd(b, a % b);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || !(object instanceof Fraction)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        Fraction other = (Fraction) object;
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }

    // Get methods for numerator and denominator
    public int getNum() {
        return numerator;
    }

    public int getDenom() {
        return denominator;
    }
}
