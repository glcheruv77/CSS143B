public class SimpleColor {
    private int r; // Red component (0-255)
    private int g; // Green component (0-255)
    private int b; // Blue component (0-255)

    // Getter for red component
    public int getR() {
        return r;
    }

    // Setter for red component with validation
    public void setR(int r) {
        if (r < 0 || r > 255) {
            throw new ColorException("Red value out of range: " + r);
        }
        this.r = r;
    }

    // Getter for green component
    public int getG() {
        return g;
    }

    // Setter for green component with validation
    public void setG(int g) {
        if (g < 0 || g > 255) {
            throw new ColorException("Green value out of range: " + g);
        }
        this.g = g;
    }

    // Getter for blue component
    public int getB() {
        return b;
    }

    // Setter for blue component with validation
    public void setB(int b) {
        if (b < 0 || b > 255) {
            throw new ColorException("Blue value out of range: " + b);
        }
        this.b = b;
    }

    // Method to set all color components at once with validation
    public void setColor(int a, int b, int c) {
        setR(a);
        setG(b);
        setB(c);
    }

    // Default constructor
    public SimpleColor() {}

    // Constructor with parameters
    public SimpleColor(int r, int g, int b) {
        setR(r);
        setG(g);
        setB(b);
    }

    // Copy constructor
    public SimpleColor(SimpleColor b) {
        this(b.r, b.g, b.b); // calling parameterized constructor
    }

    // Override equals method to compare SimpleColor objects
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof SimpleColor)) {
            return false;
        }
        SimpleColor that = (SimpleColor) o;
        return this.r == that.r && this.g == that.g && this.b == that.b;
    }
}
