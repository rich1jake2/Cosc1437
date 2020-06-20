package COSC_Labs.Lab6;

public class Circle 
{
    private double radius;
    Circle()
    {
        radius = 0; 
    }   
    
    Circle(double r)
    {
        radius = r;
    }

    public void setRadius(double r)
    {
        radius = r;

    }

    public double getRadius()
    {
        return radius;
    }

    public double area()
    {
        return Math.PI * radius * radius;

    }

    public double perimeter()
    {
        return 2*Math.PI * radius;
    }

    public String toString()
    {
        return String.format("Radisu = %.2f , Permiter = %.2f , Area = %.2f%n", radius, perimeter(), area());
        
    }

}