package Lab2;

public class Point2D {
    private int x;
    private int y;

    //Getter method
    public void setX (int nX){
        this.x = nX;
    }
    public void setY (int nY){
        this.y = nY;
    }

    //Setter method
    public int getX (){
        return x;
    }
    public int getY(){
        return y;
    }

    public void resetToOrigin (){
        x = 0;
        y = 0;
    }
    public void translate(int dx, int dy){
        x += dx;
        y += dy;
    }
    
    public String toString(){

    }


}
