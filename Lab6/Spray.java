//Glenn Cheruvathur
//CSSSKL143

import java.awt.*;
import java.awt.geom.*;

public class Spray extends Shape {
    private final int RADIUS = 20;
    private final int DENSITY = 10;

    public Spray(int a, int b) {
        super(a, b);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        final int x = getX();
        final int y = getY();
        g2d.setColor(Color.GREEN);
        g2d.setPaint(new GradientPaint(x, y, Color.GREEN, x + RADIUS / 4, y + RADIUS / 4, Color.BLACK, true));
        int xOffset = 0;
        int yOffset = 0;
        for (int i = 0; i < DENSITY; i++) {
            xOffset = (int) (Math.random() * RADIUS);
            yOffset = (int) (Math.random() * RADIUS);
            g2d.draw(new Ellipse2D.Double(x + xOffset, y + yOffset, 3, 3));
        }
    }

    @Override
    public double getArea() {
        return 0; // No area calculation for Spray
    }
}
