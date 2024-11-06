//Glenn Cheruvathur
//CSSSKL143

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);  // Default color for Rectangle
        g.drawRect(getX(), getY(), width, height);
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + ", x=" + getX() + ", y=" + getY() + "]";
    }
}
