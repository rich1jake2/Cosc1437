package COSC_Labs.Lab6;

public class Day6 
{
    private String day = new String();
    private String nDay = new String();
    private String prevDay = new String();
    private int numDay;




        

    // default constructor
    public Day6()
    {
        day = "NO DAY SET";
    }

    // Constructor with Parameter
    public Day6(String dl)
    {
        setDay(dl);

    }
    
    public void setDay(String d)
    {
        day = d;
        // Getting the Next Day, Previous Day, and integer of that day with Sunday being day 1
        switch (day)
        {
            case "Sunday":
                nDay = "Monday";
                prevDay = "Saturday";
                numDay = 1;
                break;

            case "Monday":
                nDay = "Tuesday";
                prevDay = "Sunday";
                numDay = 2;
                break;

            case "Tuesday":
                nDay = "Wednesday";
                prevDay = "Monday";
                numDay = 3;
                break;

            case "Wednesday":
                nDay = "Thursday";
                prevDay = "Tuesday";
                numDay = 4;
                break;

            case "Thursday":
                nDay = "Friday";
                prevDay = "Wednesday";
                numDay = 5;
                break;

            case "Friday":
                nDay = "Saturday";
                prevDay = "Thursday";
                numDay = 6;
                break;


            case "Saturday":
                nDay = "Sunday";
                prevDay = "Friday";
                numDay = 7;
                break;


        }
        
    }

    public String getNextDay()
    {
        return nDay;
    }

    public String getPreviousDay()
    {
        return prevDay;
    }
    
    public String addDays(int numOfDays)
    {  
        // Introducing temporary use variable because I don't think the program wants us to add the number of days and have it affect the actual day 
        // it just wants us to return a day, not modify the value of the instance variable. At least, that's what I think because of the wording
        int dummyNumDay;
        
        // the string that will be returned at the end of the method
        String rDay = new String();
        dummyNumDay = numDay;

        dummyNumDay = dummyNumDay +  (numOfDays%7);
        if (dummyNumDay > 7 )
        {
            dummyNumDay = dummyNumDay - 7 ;
        }
        switch (dummyNumDay)
        {
            case 1: 
                rDay = "Sunday";
                break;
            case 2: 
                rDay = "Monday";
                break;
            case 3:
                rDay = "Tuesday";
                break;
            case 4:
                rDay = "Wednesday";
                break;
            case 5:
                rDay = "Thursday";
                break;

            case 6:
                rDay = "Friday";
                break;
            case 7:
                rDay = "Saturday";
                break;
        }
        return rDay;
    }

    public void printDay()
    {
        System.out.print("Todays day is " + day);
    }
    
    public String getDay()
    {
        return day;
    }

    public String toString()
    {
        return String.format("" + day + "");
    }
}