
/**
 * Used to test the functioning of both square and rectangle for lab2. Not for instantiation,
 * contains main method.
 *
 * @author Sam Traylor
 * @version 1.0
 */
public class SquareTester
{
    /**
     * Main method. Creates a square, prints, its dimensions, calculates and displays area
     * and peremiter. Then, creates another identical square, and 2 rectangles identical to 
     * eachother, and prints out the value returned by "equals" comparing each pair. Last, 
     * it makes those same comparisons using the == operator.
     * 
     */
    public static void main(String args[]) 
    {
        Square Sq = new Square(4.0);
        System.out.println(Sq.toString());
        System.out.println( "Its peremiter is " + Sq.perimeter() + ", and its area is " + Sq.area() + ".");
        
        Square sq2 = new Square(4.0);
        
        Rectangle rec1 = new Rectangle(2.0,4.0);
        Rectangle rec2 = new Rectangle(2.0,4.0);
        
        System.out.println("Using equals method:");
        System.out.println("Squares: " + Sq.equals(sq2));
        System.out.println("Rectangles: " + rec1.equals(rec2));
        
        System.out.println("Using == operator:");
        System.out.println("Squares: " + (Sq == sq2));
        System.out.println("Rectangles: " + (rec1 == rec2));
    }
}
