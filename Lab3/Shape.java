
/**
 * Abstract class Shape - Uses abstract methods and inheritance to impliment the
 * creation of shapes, and the calculation of things like area and perimeter
 *
 * @author Sam Traylor
 * @version 1.0
 */
public abstract class Shape implements Displayable, Comparable<Shape>
{  
    public static int counter; 
    
    public void display() 
    {
        System.out.println("This shape is a: " + this.getShape());
        System.out.println("This shape has an area of: " + this.area());
        System.out.println("This shape has a perimeter of: " + this.perimeter());
    }
    /**
     * Method to calculate and return area. Must be defined by subclass 
     *  
     * @return the area of the object 
     */
    public abstract double area();
    
    /**
     * Method to calculate and return perimeter. Must be defined by subclass 
     *  
     * @return the perimeter of the object 
     */
    public abstract double perimeter();
    
    /**
     * Method to return type of shape 
     *  
     * @return the type of shape 
     */
    public abstract String getShape();
   
    /**
     * Method to incriment the counter 
     */
    public void increment()
    {
        if(counter > 0) {
            counter++;
        }
        else {
            counter = 1;
        }
        
    }
        
    public int compareTo(Shape sha) {
        if(this.area() < sha.area()) {
            double diff = 0 - (sha.area() - this.area());
            return (int) diff;
        }
        if(this.area() > sha.area()) {
            double diff = this.area() - sha.area();
            return (int)diff;
        }
        else 
        {
            return 0;
        }
    }
}
