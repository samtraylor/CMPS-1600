
/**
 * Subclass of Rectangle, used to instantiate a square object.
 *
 * @author Sam Traylor
 * @version 1.0
 */
public class Square extends Rectangle
{
    /**
     * The dimension given for the object (since length & width are same only, 1 param needed)
     */
    private double size;
    /**
     * Height, which will simply be defined the same as size
     */
    private double rHeight = size;
    /** 
     * Length, which will simply be defined the same as size
     */
    private double rLength = size;
    
    /**
     * Constructor for objects of class Square
     * 
     * @param size is used for the length and width of the square
     */
    public Square(double size)
    {
        super(size,size);
    }

    /**
     * Overriden version of the toString  method inherited from Rectangle. Prints out user
     * friendly information about the square object
     *   
     * @return Returns a string saying that the object is a square, and has the given 
     * dimensions  
     */
    @Override
    public String toString() {
    {
        String concat = "This shape is a square with the dimensions " + this.getHeight() + " by " + this.getLength() + ".";
        return concat;
    }
    }
    
    public double getArea() 
    {
        return this.area();
    }
    
    public double getPerimeter() 
    {
        return this.perimeter();
    }
    
    /**
     * Overriden version of the equals method from the object class.
     * Redefines to base equality off of 2 squares being the same size.
     * 
     * @return Returns true or false based on whether the size is the same
     */
    @Override
    public boolean equals(Object obj) {
      if (this == obj) {  
          return true;  
      }  
      if (obj instanceof Square){
          Square s = (Square) obj;
          if (s.getLength() == this.getLength() && s.getHeight() == this.getHeight()) {  
          return true;
         } 
      }
      return false;
    }
}

