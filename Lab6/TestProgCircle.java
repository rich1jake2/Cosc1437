
// Should demonstrate the usefulness of the user defined class 'circle,' issue is that the program calculates area of a cirlce 
// incorrectly. They do pi^2 * r, should be pi*r^2. 

/* 
    There are two problems with the way they calculate area,
    (1) The dimensions dont work out, area should be unit of length^2, but pi^2 * r only has a unit length to the first order
    (2) Area of circle should be 314.16 - per google 
*/ 
package COSC_Labs.Lab6;
import java.util.*;


public class TestProgCircle 
{
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        Circle firstCircle = new Circle();
        Circle secondCircle = new Circle(12);

        double radius;

        System.out.println("(Line 10) fistCircle" + firstCircle);

        System.out.println("(Line 11) secondCirclr" + secondCircle);

        System.out.print("Enter the Radius: ");

        radius = console.nextDouble();
        System.out.println();

        firstCircle.setRadius(radius);
        System.out.println("(line 16) firstCircle:" + firstCircle);

        if (firstCircle.getRadius()> secondCircle.getRadius())
        {
            System.out.println("(Line 18) The radius of the first circle is greater thatn the radius of the second circle");

        
        }
        else if (firstCircle.getRadius() < secondCircle.getRadius())
        {
            System.out.println("(Line 20) The radius of the first circle is less than the radius of the second circle.");
        }
        else 
        {
            System.out.println("(Line 22) The radius of both circles are the same.");
        }



    }
}