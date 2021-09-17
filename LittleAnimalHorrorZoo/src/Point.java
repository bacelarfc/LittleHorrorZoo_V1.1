import java.util.Objects;

public class Point {

   private int x;
   private int y;

   //constructs a new point at the origin, (0,0)
    public Point() {
        this(0,0); // calls Point (int, int) constructor

    }

    //constructs a new point with the given (x, y) location
    public Point(int x, int y) {
        setLocation(x, y);
    }
    /* return the x-coordinate of this point
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y); */


    public int getX() {
        return x;
    }
    // returns the y-coordinate of this point

    public int getY() {
        return y;
    }

    // sets this point's (x,y) location to the given values
    public void setLocation( int x, int y ) {
        this.x = x;
        this.y = y;
    }

    //returns a String representation of this point
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    //shifts this point's location by the given amount
    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;*/


    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

