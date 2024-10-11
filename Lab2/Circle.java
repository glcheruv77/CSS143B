package Lab2;
//Glenn Cheruvathur Code

public class Circle {
    
    private int x;
    private int y;
    private double radius;
    private final String shape = "O";
    
        // Default constructor
        public Circle() {
            this.x = 0;
            this.y = 0;
            this.radius = 1.0;
        }
    
        // Constructor with initial (x, y) pair
        public Circle(int nx, int ny) {
            this.x = nx;
            this.y = ny;
            this.radius = 1.0;
        }
    
        // Constructor with initial (x, y) pair and starting radius
        public Circle(int nx, int ny, double radius) {
            this.x = nx;
            this.y = ny;
            this.radius = radius;
        }
    
        // Getter for x
        public int getX() {
            return x;
        }
    
        // Getter for y
        public int getY() {
            return y;
        }
    
        // Getter for radius
        public double getRadius() {
            return radius;
        }
    
        // Method to calculate and return the area
        public double getArea() {
            return Math.PI * radius * radius;
        }
    
        // Setter for x
        public void setX(int nX) {
            this.x = nX;
        }
    
        // Setter for y
        public void setY(int nY) {
            this.y = nY;
        }
    
        // Setter for radius
        public void setRadius(double r) {
            this.radius = r;
        }
    
        // Override toString method
        @Override
        public String toString() {
            return shape;
        }
    
        // Equals method to compare two circles
        public boolean equals(Circle that) {
            return this.x == that.x && this.y == that.y && this.radius == that.radius;
        
    
        }
        // public static void main(String[] args) {
        //     Circle a = new Circle();
        //     a.setX(5);
        //     a.setY(2);
        //     System.out.println("Circle at (" + a.getX() + ", " + a.getY() + ")"); 
        //     a.setRadius(3.0);
        //     System.out.println("Radius: " + a.getRadius());
        //     a.setRadius(4.0);
        //     System.out.println("Area: " + a.getArea());
        //     System.out.println("Circle shape: " + a.toString());
    
        //     Circle b = new Circle();
        //     Circle c = new Circle();
        //     System.out.println(b.toString());
        //     System.out.println(c); 
        //     System.out.println("Are b and c equal: " + b.equals(c));
        // }
}
