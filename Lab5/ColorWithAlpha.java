//Glenn Cheruvathur
//CSSSKL143

public class ColorWithAlpha extends SimpleColor {
    private int alpha; // Alpha component (0-255)

    // Getter for alpha component
    public int getAlpha() {
        return alpha;
    }

    // Setter for alpha component with validation
    public void setAlpha(int alpha) {
        if (alpha < 0 || alpha > 255) {
            throw new ColorException("Alpha value out of range: " + alpha);
        }
        this.alpha = alpha;
    }

    // Constructor that takes only an alpha value
    public ColorWithAlpha(int alpha) {
        super(0, 0, 0); // Initializes RGB to 0
        setAlpha(alpha);
    }

    // Constructor that takes 4 values (RGBA)
    public ColorWithAlpha(int r, int g, int b, int alpha) {
        super(r, g, b); // Initializes RGB
        setAlpha(alpha);
    }

    // Copy constructor
    public ColorWithAlpha(ColorWithAlpha c) {
        super(c.getR(), c.getG(), c.getB()); // Calls superclass constructor
        this.alpha = c.alpha;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + ", alpha:" + alpha;
    }

    // Override equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ColorWithAlpha that = (ColorWithAlpha) o;
        return alpha == that.alpha;
    }
}

