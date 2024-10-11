//Glenn Cheruvathur Code
package Lab2;

public class Point2D {
    private int x;
    private int y;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point2D point2D = (Point2D) obj;
        return x == point2D.x && y == point2D.y;
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
