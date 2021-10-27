import java.util.*;
/**
 * Class to test shape's subclasses. No contstructor, just main method
 *
 * @author Sam Traylor
 * @version 1.0
 */
public class ShapeTester
{
    /**
     * method that takes an arraylist of shapes and displays it 
     * 
     * @param ArrayList<Shape> shapeList is a user-provided arraylist of shape objects
     */
    public static void displayArray(ArrayList<Shape> shapeList) 
    {
        for(Shape sha: shapeList) {
            sha.display();
        }
    }
    
    /**
     * Main method contructs an arraylist, constructs one of each type of shape, then adds them
     * to the arraylist. Then it loops through printing each shape's type. Then it loops through
     * only circles printing their position in the array. Then prints how many shapes were 
     * made. Finally the method tests out the above-defined displayArray method iterating 
     * through shapes and printing out their dimensions (area, perimeter, type)
     */
    public static void main(String args[]) 
    {
        Square.counter = 0;
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        
        Circle circ = new Circle(5.0);
        Rectangle rect = new Rectangle(5.0,5.0);
        Triangle tri = new Triangle(5.0,5.0,5.0);
        Square sqr = new Square(5.0);

        shapeList.add(circ);
        shapeList.add(rect);
        shapeList.add(tri);
        shapeList.add(sqr);
        
        for(Shape sha: shapeList) {
            System.out.println(sha.getShape());
        }
        
        System.out.println("");
        int index = 0;
        
        for(Shape sha: shapeList) {
            if (sha.getShape() == "circle") {
                System.out.println(sha.getShape());
                System.out.println(index);
            }
            index++;
        }
        
        System.out.println("");
        System.out.println("There are " + Shape.counter + " Shapes in this ArrayList.");
        System.out.println("");
        
        displayArray(shapeList);
        System.out.println("");
        
        Collections.sort(shapeList);
        displayArray(shapeList);
        
    }
    
}
