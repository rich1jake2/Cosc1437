package COSC_Labs.Lab6;

import java.awt.*;
import java.util.*;

public class TestRoman6 
{
    public static void main(String[] args)
    {
        Roman6 romanTwo = new Roman6();
        Roman6 romanOne = new Roman6("MCXIV");
        
        // Demonstrating Parameter Constructor
        System.out.print("\n\n===Demonstrating Constructor with Parameters===\n");
        System.out.print("romanOne after object instance declaration as romanOne = new Roman6(MCXIV)-\n***romanOne object toString***\n " + romanOne +"\n***");
        System.out.print("\n+++ Note: I overrode the toString to print the decimal and roman value +++");

        
        // Demonstarting Default Constructor and ability to change with method .setRoman
        System.out.println("\n\n=== Demonstrating Constructor with no parameters and method .setRoman() ===\n");
        System.out.println("romanTwo with default constructor \n*** romanTwo object toString***\n" + romanTwo+"\n***");
        romanTwo.setRoman("CCCLIX");
        System.out.println("\nromanTwo after declaring roman to be CCCLIX with method .setRoman()... \n*** romanTwo setRoman ***\n" + romanTwo+"\n***");

        //Demonstrating method .getDecimal and .getRoman
        System.out.println("\n\n=== Demonstrating .getRoman() and .getDecimal() methods ===\n");
        Roman6 romanThree = new Roman6("MDCLXVI");
        System.out.print("Declaring romanThree = new Roman6('MDCLXVI')...\n***romanThree object toString\n" + romanThree +"\n***" );
        System.out.print("\nUsing method .getRoman: Our Roman value for romanThree is, " + romanThree.getRoman());
        System.out.print("\nUsing method .getDecimal: Our Decimal Value for romanThree is, "+romanThree.getDecimal() );

        // Demonstrating .romanToDecimal
        Roman6 romanFour = new Roman6("MDCLXVI");
        System.out.println("\n\n=== Demonstrating .RomanToDecimal conversion === \n");
        System.out.print("After Declaring romanFour = new Roman6('MDCLXVI'): \n*** romanFour object***\n" + romanFour + "\n***");
        System.out.print("\n***.RomantoDecimal***\nUsing romanFour.RomanToDecimal to give... " + romanFour.RomantoDecimal() + "\n\n");
        
        // We should be done demonstrating everything asked of us 


        

    }
    
}