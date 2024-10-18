//Glenn Cheruvathur
//CSS143B
public class LineSegment {
    private Point2D start;
    private Point2D end;

    // What is a privacy leak?
    // A privacy leak occurs when an object exposes its internal state through a public method, allowing external code to modify it.

    // Do your getters or setters have privacy leaks?
    // No, because they return a new copy of the internal Point2D objects rather than the original objects.

    // Where else could a privacy leak occur?
    // A privacy leak could occur in any method that returns a reference type without making a defensive copy.


    //No-argument Constructor
    public LineSegment() {
        this.start = new Point2D(0, 0);
        this.end = new Point2D(0, 0);
    }

    //Parameterized constructor
    public LineSegment(Point2D start, Point2D end) {
        if (start == null || end == null || start.getX() < 0 || start.getY() < 0 || end.getX() < 0 || end.getY() < 0) {
            throw new IllegalArgumentException("Invalid points");
        }
        this.start = new Point2D(start);
        this.end = new Point2D(end);
    }

    //Copy constructor
    public LineSegment(LineSegment other) {
        this.start = new Point2D(other.start);
        this.end = new Point2D(other.end);
    }
    
    //Getters
    public Point2D getStart() {
        return new Point2D(start); // To avoid privacy leaks
    }
    
    public Point2D getEnd() {
        return new Point2D(end); // To avoid privacy leaks
    }

    //Setters
    public void setStart(Point2D point) {
        if (point == null || point.getX() < 0 || point.getY() < 0) {
            throw new IllegalArgumentException("Invalid point");
        }
        this.start = new Point2D(point);
    }
    
    public void setEnd(Point2D point) {
        if (point == null || point.getX() < 0 || point.getY() < 0) {
            throw new IllegalArgumentException("Invalid point");
        }
        this.end = new Point2D(point);
    }
    
    // toString
    @Override
    public String toString() {
        return "Line start: " + start + " end: " + end;
    }

    //equals
    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof LineSegment)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        LineSegment that = (LineSegment) other;
        return this.start.equals(that.start) && this.end.equals(that.end);
    }

    public double getDistance() {
        return CustomMath.sqrt(CustomMath.pow(end.getX() - start.getX(), 2) + CustomMath.pow(end.getY() - start.getY(), 2));
    }
    



    
    
    
    
}
