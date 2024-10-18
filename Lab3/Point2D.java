//Glenn Cheruvathur
//CSS143B 
public class Point2D {
    private int x;
    private int y;

    // Default constructor
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    //Parameterized constructor
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Copy constructor
    public Point2D(Point2D other) {
        // TODO
        this.x = other.x;
        this.y = other.y;
    }

    // Using getX or getY methods in the copy constructor is optional.
    //It boils down to your preference for consistency and readability.

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

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj) return true;
    //     if (obj == null || getClass() != obj.getClass()) return false;
    //     Point2D point2D = (Point2D) obj;
    //     return x == point2D.x && y == point2D.y;
    // }

    // Overridden equals method
    @Override
    public boolean equals(Object object) {
        if (object == null || !(object instanceof Point2D)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        Point2D point = (Point2D) object;
        return this.x == point.x && this.y == point.y;
    }

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
