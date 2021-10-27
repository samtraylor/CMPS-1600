
/**
 * Program to create and find area/perimeter for a circle
 *
 * @author Sam Traylor
 * @version 1.0
 */
public class Circle extends Shape
{
    private double radius;
 
    /**
     * Constructor for objects of class Circle, requires diameter
     * 
     * @param rad is a double representing the circle's radius
     */
    public Circle(double rad)
    {
        this.radius = rad;
        super.increment();
    }

    /**
     * concrete area method for circle 
     *
     *
     * @return the area of the circle as a double
     */
    public double area()
    {
        return Math.PI * (Math.pow(radius, 2.0));
    }
    
    /**
     * concrete perimeter (circumference) method for circle 
     *
     *
     * @return the circumference of the circle as double
     */
    public double perimeter()
    {
        return (2.0 * Math.PI) * radius;
    }
    
    /**
     * method to return type of shape 
     *
     *
     * @return shape in string form 
     */
    public String getShape()
    {
        return "circle";
    }
}
