//Glenn Cheruvathur
//CSSSKL143

import javax.swing.*;
import java.awt.*;

/** Class PolyDemo (is a JFrame) and PolyDemoPanel (is a JPanel)
 * Author: Rob Nash
 */
class PolyDemo extends JFrame {
    public PolyDemo() {
        getContentPane().add(new PolyDemoPanel());
        // Just some windowing stuff that must happen for all Frames
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new PolyDemo();
    }

    // This is our first "inner" or internal class
    public class PolyDemoPanel extends JPanel {
        Shape[] myShapes = new Shape[20];

        public PolyDemoPanel() {
            for (int i = 0; i < 20; i++) {
                myShapes[i] = getRandShape();
            }
        }

        public void paint(Graphics g) {
            super.paint(g); // Don't remove - required for GUI widgets to draw correctly
            for (Shape shape : myShapes) {
                shape.draw(g); // Use the correct method based on the runtime type of shape
            }
        }

        public int getRandInt() {
            return (int) (Math.random() * 200);
        }

        public Shape getRandShape() {
            Shape retVal = null;
            final int x = getRandInt();
            final int y = getRandInt();
            switch ((int) (Math.random() * 5)) { // Adjusted the range to include FractalFlake
                case 0:
                    retVal = new Circle(x, y, getRandInt());
                    break;
                case 1:
                    retVal = new Rectangle(x, y, getRandInt(), getRandInt());
                    break;
                case 2:
                    retVal = new Circle(x, y, getRandInt());
                    break;
                case 3:
                    retVal = new Spray(x, y);
                    break;
                case 4: // New case for FractalFlake
                    int size = (int) (Math.random() * 100 + 10);
                    int limit = (int) (Math.random() * 48 + 1);
                    int numBranches = (int) (Math.random() * 7 + 5);
                    retVal = new FractalFlake(x, y, size, limit, numBranches);
                    break;
            }
            return retVal;
        }
        
    }
}
