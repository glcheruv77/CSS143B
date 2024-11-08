// Glenn Cheruvathur
// CSSSKL143

import java.awt.Graphics;

public class FractalFlake extends Shape {
    private final int limit;
    private final int numBranches;
    private final int size;

    public FractalFlake(int x, int y, int size, int limit, int numBranches) {
        super(x, y);
        this.size = size;
        this.limit = limit;
        this.numBranches = numBranches;
    }

    @Override
    public void draw(Graphics g) {
        draw(g, getX(), getY(), limit);
    }

    private void draw(Graphics g, int startX, int startY, int limit) {
        if (limit >= 3) {
            for (int i = 0; i < numBranches; i++) {
                int x2 = startX + (int) (size * Math.cos((2 * Math.PI / numBranches) * i));
                int y2 = startY - (int) (size * Math.sin((2 * Math.PI / numBranches) * i));

                g.drawLine(startX, startY, x2, y2);

                // Recursive call with reduced limit
                draw(g, x2, y2, limit / 3);
            }
        }
    }
}
