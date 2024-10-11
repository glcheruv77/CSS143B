package Lab2;
//Glenn Cheruvathur Code

public class Square {
    // Declare x, y position variables and sideLength
    private int x;
    private int y;
    private double sideLength;

    // String to represent the shape of a rectangle
    private final String shape = "[]";

    //Cnnstructor takes no arguments
    public Square(){
        this.x = 0;
        this.y = 0;
        this.sideLength = 1.0;
    }

    //Cnnstructor takes an initial (x, y)
    public Square(int nx, int ny){
        this.x = nx;
        this.y = nx;
        this.sideLength = 1.0;
    }

    // Constructor with initial (x, y) pair and starting side length
    public Square(int nx, int ny, double sideLength) {
        this.x = nx;
        this.y = ny;
        this.sideLength = sideLength;
    }
    // Getter for x
    public int getX() {
        return x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Getter for sideLength
    public double getSideLength() {
        return sideLength;
    }

    // Method to calculate and return the area
    public double getArea() {
        return sideLength * sideLength;
    }

    // Setter for x
    public void setX(int nX) {
        this.x = nX;
    }

    // Setter for y
    public void setY(int nY) {
        this.y = nY;
    }

    // Setter for sideLength
    public void setSideLength(double sl) {
        this.sideLength = sl;
    }
    // Override toString method
    @Override
    public String toString() {
        return shape;
    }

    // Equals method
    public boolean equals(Square that) {
        return this.x == that.x && this.y == that.y && this.sideLength == that.sideLength;
    }
    // public static void main(String[] args) {
    //     Square a = new Square();
    //     a.setX(5);
    //     a.setY(2);
    //     System.out.println("Square at (" + a.getX() + ", " + a.getY() + ")"); 
    //     a.setSideLength(3.0);
    //     System.out.println("Side Length: " + a.getSideLength());
    //     a.setSideLength(4.0);
    //     System.out.println("Area: " + a.getArea());
    //     System.out.println("Square shape: " + a.toString());

    //     Square b = new Square();
    //     Square c = new Square();
    //     System.out.println(b.toString());
    //     System.out.println(c); 
    //     System.out.println("Are b and c equal: " + b.equals(c));
    // }

}