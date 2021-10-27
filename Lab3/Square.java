
/**
 * Program to create and find area/perimeter for a square
 *
 * @author Sam Traylor
 * @version 1.0
 */
public class Square extends Rectangle
{
    private double length;
    private double width;
    /**
     * Constructor for objects of class square, requires size as double
     * 
     * @param sSize is the length of all 4 sides as a double
     * 
     */
    public Square(double sSize)
    {
        super(sSize, sSize);
        this.width = sSize;
        this.length = sSize;
       
    }

    /**
     * concrete area method for Square
     *
     *
     * @return the area of the Square as a double
     */
    public double area()
    {
        return length * width;
    }
    
    /**
     * concrete perimeter method for Square
     *
     *
     * @return the perimeter of the Square as double
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
        return "square";
    }
}
