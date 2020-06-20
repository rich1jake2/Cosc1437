package COSC_Labs.Lab6;

public class TestDay6 
{
    public static void main(String[] args)
    {
        Day6 dayOne = new Day6();
        Day6 dayTwo = new Day6("Sunday");
        Day6 dayThree = new Day6("Friday");

        // Handling dayOne
        System.out.print("\n\n === dayOne with no paramters ===");
        System.out.print("dayOne object with toString override- " + dayOne + "\n");
        
        dayOne.setDay("Monday\n");
        System.out.print("After dayOne.setDay('Monday'), dayOne w/ toString override = " + dayOne + "\n");
        System.out.println("********");



        // Handling dayTwo 
        System.out.print("\n\n === dayTwo = new Day6('Sunday') ===");
        System.out.println("Using .printDay() method\n");
        dayTwo.printDay();
        System.out.println("\nUsing the returned value .getDay() to print: Today is " + dayTwo.getDay());
        System.out.println("Adding 2 Days..." + dayTwo.addDays(2));
        System.out.println("Adding 27 Days ..." + dayTwo.addDays(27));
        System.out.println("Adding 140 days ..." + dayTwo.addDays(140));
        System.out.println("Next Day is " + dayTwo.getNextDay());
        System.out.println("Previous day was " + dayTwo.getPreviousDay());
        System.out.println("*********\n\n");


        // Handling dayThree
        System.out.print("\n\n === dayThree = new Day6('Friday') ===");
        System.out.println("Using .printDay() method\n");
        dayThree.printDay();
        System.out.println("\nUsing the returned value .getDay() to print: Today is " + dayThree.getDay());
        System.out.println("Adding 2 Days..." + dayThree.addDays(2));
        System.out.println("Adding 27 Days ..." + dayThree.addDays(27));
        System.out.println("Adding 140 days ..." + dayThree.addDays(140));
        System.out.println("Next Day is " + dayThree.getNextDay());
        System.out.println("Previous day was " + dayThree.getPreviousDay());
        System.out.println("*********");




    
    
    }
    
}