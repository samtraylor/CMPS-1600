/* Created: Bob Roos, 3 October 2013
Edited: Anastasia Kurdia, 11 January 2016
This program models the work of an octopus in the kitchen
and tests the work of Octopus and Utensil class functions
*/


public class Lab1
{
    public static void main(String[] args)
    {
        // Variable dictionary:
        Octopus ocky;           // an octopus
        Octopus octodad;
        Utensil spat;           // a kitchen utensil
        Utensil fork;

        spat = new Utensil("spatula"); // create a spatula
        spat.setColor("green");        // set spatula properties--color...
        spat.setCost(10.59);           // ... and price

        ocky = new Octopus("Ocky",10);    // create and name the octopus
        //ocky.setAge(10);               // set the octopus's age...
        ocky.setWeight(100);           // ... weight,...
        ocky.setUtensil(spat);         // ... and favorite utensil.
        
        octodad = new Octopus("octodad",40);
        octodad.setWeight(100);
        
        fork = new Utensil("fork");
        fork.setColor("silver");
        fork.setCost(3.50);
        
        octodad.setUtensil(fork);
        
        

        System.out.println("Testing 'get' methods:");
        System.out.println(ocky.getName() + " weighs " +ocky.getWeight()
            + " pounds\n" + "and is " + ocky.getAge()
            + " years old. His favorite utensil is a "
            + ocky.getUtensil());

        System.out.println(ocky.getName() + "'s " + ocky.getUtensil() + " costs $"
            + ocky.getUtensil().getCost());
        System.out.println("Utensil's color: " + spat.getColor());

        // Use methods to change some values:

        ocky.setAge(20);
        ocky.setWeight(125);
        spat.setCost(15.99);
        spat.setColor("blue");

        System.out.println("\nTesting 'set' methods:");
        System.out.println(ocky.getName() + "'s new age: " + ocky.getAge());
        System.out.println(ocky.getName() + "'s new weight: " + ocky.getWeight());
        System.out.println("Utensil's new cost: $" + spat.getCost());
        System.out.println("Utensil's new color: " + spat.getColor());
        
        //--------------- OCTODAD PRINT SECTION
        
        System.out.println("Testing 'get' methods:");
        System.out.println(octodad.getName() + " weighs " +octodad.getWeight()
            + " pounds\n" + "and is " + octodad.getAge()
            + " years old. His favorite utensil is a "
            + octodad.getUtensil());

        System.out.println(octodad.getName() + "'s " + octodad.getUtensil() + " costs $"
            + octodad.getUtensil().getCost());
        System.out.println("Utensil's color: " + fork.getColor());
        
        
    }
}
