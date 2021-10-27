
/**
 * Program to create and find area/perimeter for a triangle
 *
 * @author Sam Traylor
 * @version 1.0
 */
public class Triangle extends Shape
{
    private double r1;
    private double r2; //sides 1,2 and 3 of the triangle
    private double r3;
 
    /**
     * Constructor for objects of class triangle, requires 3 sides given as
     * doubles.
     * 
     * @param re1 is a double representing the triangles 1st side
     * @param re2 is a double representing the triangles 2nd side
     * @param re3 is a double representing the triangles 3rd side
     */
    public Triangle(double re1, double re2, double re3)
    {
        this.r1 = re1;
        this.r2 = re2;
        this.r3 = re3;
        super.increment();
    }

    /**
     * concrete area method for triangle
     *
     *
     * @return the area of the triangle as a double
     */
    public double area()
    {
        double svar = (r1 + r2 + r3) / 2.0;
        double area = Math.sqrt((svar * (svar - r1) * (svar - r2) * (svar - r3)));
        return area;
    }
    
    /**
     * concrete perimeter method for triangle
     *
     *
     * @return the perimeter of the triangle as double
     */
    public double perimeter()
    {
        return r1 + r2 + r3;
    }
    
    /**
     * method to return type of shape 
     *
     *
     * @return shape in string form 
     */
    public String getShape()
    {
        return "triangle";
    }
}
