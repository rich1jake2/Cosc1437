/* 
    -----
    Exercise 14 - Page 110 
    Write a program that does the following 
    a - prompts the user to enter the total amount of milk produces in the morning 
    b - outputs the number of milt cartons needed to hold milt (Round to nearest integer)
    c - outputs the cost of producing milt 
    d - outputs the profit for producing milk 
    -----
*/

package COSC_Labs;

import java.text.DecimalFormat;
// Importing - 
import java.util.Scanner;
//import java.util.concurrent.atomic.DoubleAccumulator;


public class Exercise14 
{
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Exercise 14 - ");
        System.out.println();
        /* 
        Decimal Formatting - googled the documentation here is the source I used to solve the issue of too many decimals 
        https://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html
        */
        DecimalFormat deciForm = new DecimalFormat("#.00");

        // Variable Initialization 
        double producedMilk; 
        int cartonsNeeded;
        double totalCost;
        double totalProfit;
        
        // Constant Declaration 
        final double cartonVol = 3.7800; // Unit is in liters 

        System.out.println("How Much Milk was produced in the Morning (in Liters)?");
        producedMilk = console.nextFloat();

        // Calculating the number of cartons needed and rounding to the nearest integer 
        cartonsNeeded = (int)(producedMilk/cartonVol);

        // Calculating the resulting cost and profit 
        totalCost = 0.38*producedMilk;
        totalProfit = 0.27*cartonsNeeded;

        System.out.println("Cartons Produced: "+ cartonsNeeded + "\nTotal Cost of Prodduction (CoP): $"+ deciForm.format(totalCost) +"\nTotal Profit of Production (PoP): $"+ deciForm.format(totalProfit));

    }
}