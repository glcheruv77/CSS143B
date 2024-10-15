//Glenn Cheruvathur Code
package Lab2;

public class Point2D {
    private int x;
    private int y;
    // What effect does “private” have for methods trying to use x or y inside this class file?
    // A: The private keyword means that x and y can only be accessed directly within the Point2D class.
    // What about methods trying to use x and y outside this class?
    // A: x and y are not directly accessible from outside the Point2D class. 
    // Instead, you have to use the provided public methods like setX to modify or access their values. 
    // Can you use x and y without an associated object (or instance)?
    // A:You need an instance (an object) of Point2D to use x and y. 
    // You can’t use them without first creating a Point2D object.

    //Setter method
    public void setX (int nX){
        this.x = nX;
    }
    public void setY (int nY){
        this.y = nY;
    }

    //Getter method
    public int getX (){
        return x;
    }
    public int getY(){
        return y;
    }

    public void resetToOrigin (){
        this.x = 0;
        this.y = 0;
    }
    public void translate(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    
    public String toString(){
        return "(" + x + ", " + y +")";
    }
    // What does @Override do?
    // A: It’s there to make sure you’re actually replacing a method and not just creating a new one by mistake. 
    // It is a double-check that you’re doing what you meant to do.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point2D point2D = (Point2D) obj;
        return x == point2D.x && y == point2D.y;
    }
    // Why don’t I need c.toString() here?
    // A: You don't need c.toString() because System.out.println(c) automatically calls the toString() method for the object c. 
    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.setX(5);
        a.setY(2);
        System.out.println("Point at (" + a.getX() + ", " + a.getY() ); 
        a.translate(-1,-1);
        System.out.println("Point at (" + a.getX() + ", " + a.getY() );
        a.resetToOrigin();
        System.out.println("Point at (" + a.getX() + ", " + a.getY() ); 
        Point2D b = new Point2D();
        Point2D c = new Point2D();
        System.out.println(b.toString());
        System.out.println(c); 
        System.out.println("Are b and c equal:" + b.equals(c));
    }


}
