package main.java.triangle;

//import com.company.java.triangle.points.Ex8;

public class Point {

    private int x=0;
    private int y=0;

    protected Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }

    public void setX(int x) { this.x = x; }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
