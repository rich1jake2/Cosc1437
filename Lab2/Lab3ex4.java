package COSC_Labs.Lab2;
import java.util.*;


public class Lab3ex4 
{
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args)
    {
        double cost;
        double area;
        
        double bagSize;

       


        System.out.print("Enter the amount of fertelizer, in pounds, in one bag: ");
        bagSize = console.nextDouble();
        bagSize = (Double)(bagSize);
        System.out.println();

        System.out.print("Enter the cost of the bag " + (bagSize) + " pound Fertilizer bag: $ ");
        cost = console.nextDouble();
        cost = (Double)(cost);
        System.out.println();



        System.out.print("Enter the area in square feet that can be fertilized by one bag: ");
        area = console.nextDouble();
        area = (Double)(area);
        System.out.println();

        

        System.out.printf("The cost of the fertilizer per pound is: $ %.2f%n ", (Double)(cost/bagSize));
        System.out.printf("The cost of fertilizing per square foot is: $ %.2f%n", (Double)(cost/area));



    }
}