import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Test
{
    public static void main(String[] args) throws IOException {
        //Scanner scnr = new Scanner(new FileInputStream(args[0]));
        Scanner scnr = new Scanner(new FileInputStream("/Users/samtraylor/Desktop/CompSci2/Lab6/Circle.java"));
        List<String> lines = new Stack();
        while(scnr.hasNextLine()) //results in first line of file ending at bottom of stack
        { 
            lines.add(scnr.nextLine());
        }
        
        Stack<String> stack = new Stack();
        int x;
        
        for(String y: lines) {
            System.out.println(y);
            for(x = 0; x < y.length(); x++) {
                /*if (stack.empty() != true) {
                    System.out.println(stack.peek());
                } */
                
                
                if(y.substring(x,x+1).equals("(")) {
                    stack.push(y.substring(x,x+1));
                }
                if(y.substring(x,x+1).equals("[")) {
                    stack.push(y.substring(x,x+1));
                }
                if(y.substring(x,x+1).equals("{")) {
                    stack.push(y.substring(x,x+1));
                }
                
                if(y.substring(x,x+1).equals(")") && stack.peek().equals("(") == false) {
                    System.out.printf("Error. Closing ) encountered. %s popped off the stack.\n", stack.pop());
                }
                if(y.substring(x,x+1).equals("]") && stack.peek().equals("[") == false)  {
                    System.out.printf("Error. Closing ] encountered. %s popped off the stack.\n", stack.pop());
                }
                if(y.substring(x,x+1).equals("}") && stack.peek().equals("{") == false) {
                    System.out.printf("Error.3 Closing } encountered. %s popped off the stack.\n", stack.pop());
                }
            }
            //System.out.println("Line" + y + "evaluated, stack top =" + stack.peek());
        }
    
        if(stack.empty() == false) {
            System.out.println("Stack not empty, not all parentheses closed.");
    
        }
        else
        {
            System.out.println("Parentheses are balanced.");
    
        }
        
    }
    /*public static  getFile(Stack input) {
        return input.pop(); 
    */
} 

