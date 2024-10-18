//Glenn Cheruvathur
//CSS143B 
import java.awt.Color;

public class Shape{
    private int x;
    private int y;
    private Color color;

    //constructors
    public Shape() {
        // TODO
        this.x = 0;
        this.y = 0;
        this.color = Color.BLACK; // default I think
    }
    public Shape(int x, int y, Color color) {
        this.x = x;
        // TODO
        this.y = y;
        //I have no idea what to do with the color
        this.color = color; //Default
    }
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    

    //Methods
    public double getArea() {
        return -1;
    }

    public void draw(Graphics g) {}

    @Override
    public String toString() {
        // TODO
        return "shape ("+ x +","+ y +") and color: "+ color;
    }

}