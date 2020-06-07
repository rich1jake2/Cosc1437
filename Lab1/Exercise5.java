package COSC_Labs;

// Exercise 5 - page 108-109

// Importing - 
import java.util.Scanner;

// Creating the public class to execute 
public class Exercise5
{
    
    // Getting the Console to enable inputs 
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Execercise 5 - ");
        System.out.println();
        // Variable Intialization
        int width;
        int length;
        int area;
        int perimeter; 

        // Prompting and Storing the variable 'length'
        System.out.print("Enter the length:");
        length = console.nextInt();
        
        // Prompting and Storing the variable 'width'
        System.out.print("Enter the width: ") ;
        width = console.nextInt();

        // Calculating area and perimeter 
        System.out.println();
        area = length * width ;
        perimeter = 2*(length + width);
        
        // Printing out Area and perimater 
        System.out.println("Area = "+ area);
        System.out.println("Perimeter = "+ perimeter);


    }
}