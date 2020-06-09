package COSC_Labs.Lab2;

import java.util.*;

public class Lab2ex2 
{
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args)
    {
        double height;
        double radius;
        final double PI = 3.14159;

        System.out.print("Enter the height of the cylinder:");
        height = console.nextDouble();

        System.out.print("Enter the radius of the base of the cylinder:");
        radius = console.nextDouble();

       
        System.out.println("Volume = " + String.format("%.2f",(PI * Math.pow(radius,2.0)*height)));
        System.out.println("Surface Area = " + String.format("%.2f",(2*PI*Math.pow(radius,2.0)+(2* PI*radius*height))));





    }
}