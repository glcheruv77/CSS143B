public class ColorWithAlpha extends SimpleColor {
    private int alpha;

    // Constructor with just alpha value
    public ColorWithAlpha(int alpha) {
        super(); // Calls the default constructor of SimpleColor
        this.alpha = alpha;
    }

    // Constructor with RGBA values
    public ColorWithAlpha(int r, int g, int b, int alpha) {
        super(); // Calls the default constructor of SimpleColor
        setR(r);
        setG(g);
        setB(b);
        this.alpha = alpha;
    }

    // Copy constructor
    public ColorWithAlpha(ColorWithAlpha c) {
        super(); // Calls the default constructor of SimpleColor
        setR(c.getR());
        setG(c.getG());
        setB(c.getB());
        this.alpha = c.alpha;
    }

    // Getter for alpha value
    @Override
    public int getAlpha() {
        return alpha;
    }

    // Setter for alpha value
    @Override
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + ", alpha:" + alpha;
    }
}
