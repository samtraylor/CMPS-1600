 public class Rectangle{
     
    private double rHeight;
    private double rLength;
    public static int count = -1;
    private int rectangleID;
    
    public Rectangle(double length, double height) {
        this.rHeight = height;
        this.rLength = length;
        count++;
        this.rectangleID = count;
    }
    
    public double getHeight() {
        return rHeight;
    }
    public double getLength() {
        return rLength;
    }
    public void setHeight(double height) {
        rHeight = height;
    }
    public void setLength(double length) {
        rLength = length;
    }
    public double area() {
        return getHeight() * getLength();
    }
    public double perimeter() {
        return ((getHeight() * 2) + (getLength() * 2));
    }
    public int getRectangleID() {
        return (int) (this.rectangleID);
    } 
    public String toString() {
        String concat = "This shape is a rectangle with the dimensions " + getHeight() + " by " + getLength() + ".";
        return concat;
    }
}