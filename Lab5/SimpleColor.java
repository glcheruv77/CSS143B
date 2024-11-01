//Glenn Cheruvathur
//CSSSKL143

public class SimpleColor {
    private int r; // Red component (0-255)
    private int g; // Green component (0-255)
    private int b; // Blue component (0-255)
    private int alpha; // Alpha component (0-255)

    // Getter for red component
    public int getR() {
        return r;
    }

    // Setter for red component
    public void setR(int r) {
        this.r = r;
    }

    // Getter for green component
    public int getG() {
        return g;
    }

    // Setter for green component
    public void setG(int g) {
        this.g = g;
    }

    // Getter for blue component
    public int getB() {
        return b;
    }

    // Setter for blue component
    public void setB(int b) {
        this.b = b;
    }

    // Getter for alpha component
    public int getAlpha() {
        return alpha;
    }

    // Setter for alpha component
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + ", alpha:" + alpha;
    }
}
