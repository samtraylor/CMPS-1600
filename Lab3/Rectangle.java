
/**
 * Program to create and find area/perimeter for a rectangle
 *
 * @author Sam Traylor
 * @version 1.0
 */
public class Rectangle extends Shape
{
    private double length;
    private double width;
    /**
     * Constructor for objects of class Rectangle, requires Length and with
     * as doubles
     * 
     * @param rWidth is a double representing the rectangles width
     * @param rLength is a double representing the rectangles length
     */
    public Rectangle(double rWidth, double rLength)
    {
        this.width = rWidth;
        this.length = rLength;
        super.increment();
    }

    /**
     * concrete area method for rectangle
     *
     *
     * @return the area of the rect as a double
     */
    public double area()
    {
        return length * width;
    }
    
    /**
     * concrete perimeter method for rectangle
     *
     *
     * @return the perimeter of the rectangle as double
     */
    public double perimeter()
    {
        return (width * 2.0) + (length * 2.0);
    }
    
    /**
     * method to return type of shape 
     *
     *
     * @return shape in string form 
     */
    public String getShape()
    {
        return "rectangle";
    }
}
