/*
    Rearange the statments from the code to get it to output properly 
    
*/

package Lab3;

import java.util.*;

public class Chp4ex4
{ 
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        String shape;
        double length;
        double width;
        double height;
        double radius;

        final double PI = 3.1415;
        
        
        System.out.print("Enter the shape type (rectangle, cirlce, cylinder):");
        shape = console.nextLine();
        System.out.println();

        if (shape.compareTo("rectangle") == 0)
        {
            System.out.print("Enter the width of the rectangle: ");
            width = console.nextDouble();
            System.out.println();

            System.out.print("Enter the length of the rectangle:");
            length = console.nextDouble();
            System.out.println();


            System.out.printf("Perimeter of the rectangle is: %.2f%n",2*(width + length));
            System.out.printf("Area of the rectangle is: %.2f%n", width*length);
            System.out.println();

        }
        
        else if (shape.compareTo("circle") == 0)
        {
            System.out.print("Enter the radius of the circle: ");
            radius = console.nextDouble();
            System.out.println();


            System.out.printf("Circumference of the circle is: %.2f%n ",2 * PI * radius);
            System.out.printf("Area of the circle is: %.2f%n ", PI * Math.pow(radius,2));
            System.out.println();

        }

        else if (shape.compareTo("cylinder") == 0)
        {
            System.out.print("Enter the radius of the base of the cylinder: ");
            radius = console.nextDouble();
            System.out.println();

            System.out.print("Enter the height of the cylinder: ");
            height = console.nextDouble();

            System.out.printf("The Volume of the cylinder is: %.2f%n", PI * Math.pow(radius,2.0) * height);
            System.out.printf("The Surface Area of the cylinder is: %.2f%n", 2*PI*radius*height );
            System.out.println();


        }
        else
        {
            System.out.println("System does not handle " + shape);
        }

        

    }
}