//Glenn Cheruvathur
//CSSSKL143

public class ColorException extends RuntimeException {
    // no-arg constructor
    public ColorException() {
        super("An error occurred in Color");
    }

    // second constructor with a message
    public ColorException(String msg) {
        super(msg);
    }

    // main method to test
    public static void main(String[] args) {
        throw new ColorException("A test in main");
    }
}
