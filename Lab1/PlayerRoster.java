
import java.util.*;
public class PlayerRoster {
    public static void main(String args[]) {
        
        int x;
        int[] numbers = new int[6];
        int[] rating = new int[6];
        Scanner scnr = new Scanner(System.in);
        
        for(x = 1; x != 6; x++) {    
            System.out.println("Enter player " + x + "\'s jersey number:");
            int p = scnr.nextInt();
            numbers[x-1] = p;
            System.out.println("Enter player " + x + "\'s rating:");
            int r = scnr.nextInt();
            rating[x-1] = r;
            System.out.println();
        }
        
        System.out.println("ROSTER");
        for(x = 1; x != 6; x++) {
                System.out.println("Player " + x + " -- Jersey number: " + numbers[x-1] + ", Rating: " + rating[x-1]);
            
        }
        System.out.println("");
        System.out.println("MENU");
        System.out.println("u - Update player rating");
        System.out.println("a - Output players above a rating");
        System.out.println("r - Replace player");
        System.out.println("o - Output roster");
        System.out.println("q - Quit");
        System.out.println("");
        System.out.println("Choose an option:");
        
        char menuSelection = scnr.next().charAt(0);
        
        while(menuSelection != 'q') {
            if(menuSelection == 'o') {
                System.out.println("ROSTER");
                for(x = 1; x != 6; x++) {  
                    System.out.println("Player " + x + " -- Jersey number: " + numbers[x-1] + ", Rating: " + rating[x-1]);

                    
                }
                System.out.println("");
                System.out.println("MENU");
                System.out.println("u - Update player rating");
                System.out.println("a - Output players above a rating");
                System.out.println("r - Replace player");
                System.out.println("o - Output roster");
                System.out.println("q - Quit");
                System.out.println("");
                System.out.println("Choose an option:");
                menuSelection = scnr.next().charAt(0);
            }
            
            if(menuSelection == 'u') {
                
                System.out.println("Enter a jersey number: ");
                int jerseyToChange = scnr.nextInt();
                int indexForChange = 0;
                for(x = 0; x != 5; x++) {
                    if(numbers[x] == jerseyToChange) {
                        indexForChange = x;
                    }   
                }
                System.out.println("Enter a new rating for player");
                int newrating = scnr.nextInt();
                rating[indexForChange] = newrating;
                
                System.out.println("MENU");
                System.out.println("u - Update player rating");
                System.out.println("a - Output players above a rating");
                System.out.println("r - Replace player");
                System.out.println("o - Output roster");
                System.out.println("q - Quit");
                System.out.println("");
                System.out.println("Choose an option:");
                menuSelection = scnr.next().charAt(0);
            }
            
            if(menuSelection  == 'a') {
            System.out.println("Enter a rating:");
            String ratingForUse = scnr.next();
            Integer ratingNum = Integer.valueOf(ratingForUse);
            System.out.println("ABOVE " + ratingNum);
            for(x = 0; x != 5; x++) {
                if(rating[x] > ratingNum) {
                    System.out.println("Player " + (x+1) + " -- Jersey number: " + numbers[x] + ", Rating: " + rating[x]);
                }
            }
                 System.out.println("");
                System.out.println("MENU");
                System.out.println("u - Update player rating");
                System.out.println("a - Output players above a rating");
                System.out.println("r - Replace player");
                System.out.println("o - Output roster");
                System.out.println("q - Quit");
                System.out.println("");
                System.out.println("Choose an option:");
                menuSelection = scnr.next().charAt(0);
            }
        	
            if(menuSelection  == 'r') {
    		System.out.println("Enter a jersey number:");
    		Integer jerseyToChange = Integer.valueOf(scnr.next());
    		System.out.println("Enter a new jersey number:"); 
    		Integer newJerseyNum = Integer.valueOf(scnr.next());
    		int indexForChange = 0;
    		System.out.println("Enter a rating for the new player:");
    		Integer newRating = Integer.valueOf(scnr.next());
    		for(x = 0; x != 5; x++) {
    			if(numbers[x] == jerseyToChange) {
    			 indexForChange = x;
    			 numbers[x] = newJerseyNum;
    			}	
    			rating[indexForChange] = newRating;
    		}
        		
    		System.out.println("MENU");
                System.out.println("u - Update player rating");
                System.out.println("a - Output players above a rating");
                System.out.println("r - Replace player");
                System.out.println("o - Output roster");
                System.out.println("q - Quit");
                System.out.println("");
                System.out.println("Choose an option:");
                menuSelection = scnr.next().charAt(0);
        	}
        } 
    }
}

