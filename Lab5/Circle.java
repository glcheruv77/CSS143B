import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);  // Default color for Circle
        g.drawOval(getX() - radius, getY() - radius, 2 * radius, 2 * radius);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", x=" + getX() + ", y=" + getY() + "]";
    }
}
