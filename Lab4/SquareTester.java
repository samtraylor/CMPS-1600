import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Program to perform JUnit testing on the square class
 *
 * @author Sam Traylor
 * @version 1.0
 */
public class SquareTester
{
    /**
     * Main class for testing Square. First, 5 objects of square, two base cases and 3 border
     * cases will be initialized for later testing
     */
    public static void main(String[] args)
    {
        Square s1 = new Square(2);
        Square s2 = new Square(10);
        Square s3 = new Square(6.5);
        Square s4 = new Square(0);
        Square s5 = new Square(-3);
        Square s6 = new Square(3);
        Square s7 = new Square(-3);
        
        //Tests begin 
        
        System.out.println("Beginning Tests:");
        
        //Beginning of assertion tests for getArea() method 
        
        assert (s1.getArea() == 4) : "Assertion (s1.getArea() == 4) failed.";
        assert (s2.getArea() == 100) : "Assertion (s2.getArea() == 100) failed.";
        assert (s3.getArea() == 42.25) : "Assertion (s3.getArea() == 42.25) failed.";
        assert (s4.getArea() == 0) : "Assertion (s4.getArea() == 0) failed.";
        assert (s5.getArea() == 9) : "Assertion (s5.getArea() == 9) failed.";
        
        //Beginning assertion tests for getPerimeter() method:
        
        assert (s1.getPerimeter() == 8) : "Assertion (s1.getPerimeter() == 8) failed.";
        assert (s2.getPerimeter() == 40) : "Assertion (s2.getPerimeter() == 40) failed.";
        assert (s3.getPerimeter() == 26) : "Assertion (s3.getPerimeter() == 26) failed.";
        assert (s4.getPerimeter() == 0) : "Assertion (s4.getPerimeter() == 0) failed.";
        assert (s5.getPerimeter() == -12) : "Assertion (s5.getPerimeter() == -12) failed.";
        
        //Beginning assertion tests for toString() method:
        
        assert (s1.toString().equals("This shape is a square with the dimensions 2.0 by 2.0.")) : "Assertion (s1.toString().equals(\"This shape is a square with the dimensions 2.0 by 2.0.\")) failed.";
        assert (s2.toString().equals("This shape is a square with the dimensions 10.0 by 10.0.")) : "Assertion (s2.toString().equals(\"This shape is a square with the dimensions 10.0 by 10.0.\")) failed.";
        assert (s3.toString().equals("This shape is a square with the dimensions 6.5 by 6.5.")) : "Assertion (s3.toString().equals(\"This shape is a square with the dimensions 6.5 by 6.5.\")) failed.";
        assert (s4.toString().equals("This shape is a square with the dimensions 0.0 by 0.0.")) : "Assertion (s4.toString().equals(\"This shape is a square with the dimensions 0.0 by 0.0.\")) failed.";
        assert (s5.toString().equals("This shape is a square with the dimensions -3.0 by -3.0.")) : "Assertion (s5.toString().equals(\"This shape is a square with the dimensions -3.0 by -3.0.\")) failed.";
        
        //Beginning assertion tests for .equals() method:
        
        assert (!s1.equals(s2)) :  "Assertion (s1.equals(s2)) failed";
        assert (!s1.equals(s3)) :  "Assertion (s1.equals(s3)) failed";
        assert (!s5.equals(s6)) :  "Assertion (s5.equals(s6)) failed";
        assert (s5.equals(s7)) :  "Assertion (s5.equals(s7)) failed";
        
        System.out.println("Testing complete.");
    }
}
