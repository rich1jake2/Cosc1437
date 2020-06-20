package COSC_Labs.Lab5;

import java.util.*;


public class GymMemberMenu 
{
    static Scanner console = new Scanner(System.in);
    

    public static void main(String[] args)
    {
        int age = 0; 
        int option = 0;
        char lvl = 'd';
        char fullPay = 'N';
        int noSesh = 0;

        boolean truther = true;
        boolean truth2 = true;
        


        while (truther)
        {
            age = displayGeneralInfo();
            option = getData();

            while (truth2)
            {
            
                if (option == 1)
                {
                    lvl = getMembershipInfo(); 
                    if (lvl == 'C' || lvl == 'c')
                    {
                        System.out.println("Pay in Full (Y/N)? ");
                        fullPay = console.next().charAt(0);
                    } 
                    noSesh = 0; // Filler for the total membership cost method
                    truth2 = false;
                }
                else if (option == 2 )
                {
                    noSesh = getSessionInfo();
                    lvl = 'N'; // Filler for the Total Membership cost method
                    
                    truth2 = false;
                }
                
                else
                {
                    System.out.println("Invalid Input");
                    break;

                }
            }
            System.out.print("Your total is: $" + String.format("%.2f",TotalMemberCost(age, option , lvl, noSesh, fullPay)) +"\n");
            truth2 = true;
            System.out.println("[Program Auto-Restart for ease]\n");

        }


    }

    public static int displayGeneralInfo()
    {
        int ageag; 
        System.out.print("Welcome to Fitness Center\nService Costs"+
		"\n3 month membership $350" + 
		"\n6 month membership $600"+
		"\n1 year membership $1000 (15% discount if paid in full)" +
		"\nPersonal training sessions $80/hour for each session"+
		"\n(20% discount on each session if more than 5 sessions are purchased)"+
		"\n***If you are 55 years or older, you will receive a 30% discount"+
		"\n\nPlease enter your age:");
        ageag = console.nextInt();

        return ageag;
    }

    public static int getData()
    {
        int PurchOpt; 
        System.out.print("Enter:\n1: To purchase Membership\n2: To purchase Training Sessions\n");
        PurchOpt = console.nextInt();


        return PurchOpt;
    }
    public static char getMembershipInfo()
    {
        char memberLevel; 
        System.out.print("\nChoose Membership Level:\nA - 3 month membership $350\nB - 6 month membershipn $600"
        +"\nC - 1 year membership $1000 (%15 discount if paid in full)\n");
        memberLevel = console.next().charAt(0);

        

        return memberLevel;



    }
    public static int getSessionInfo()
    {
        int NoOfSesh;
        System.out.print("Enter the number of sessions you would like to purchase (by number of hours): ");
        NoOfSesh = console.nextInt();
        return NoOfSesh;

    }
    public static double  TotalMemberCost(int ager , int opt, char memLevel, int seshNo, char payAmount )
   
    {
        double FinalCost = 0.00;
        // double discount;
        if (opt == 1 )
        {
            switch (memLevel)
            {
                case 'A': FinalCost = 350.00;
                    break;
                case 'a': FinalCost = 350.00;
                    break;
                
                case 'B': FinalCost = 600.00;
                    break;
                case 'b': FinalCost = 600.00;
                    break;
                    
                case 'C': FinalCost = 1000.00;
                    break;
                case 'c': FinalCost = 1000.00;
                    break;

            }
            if (ager >=55)
            {
                FinalCost = FinalCost - .3*FinalCost;
            }
            
            if (payAmount == 'Y' || payAmount == 'y')
            {
                FinalCost = FinalCost - .15*FinalCost;
            }
        }
        if (opt == 2)
        {
            FinalCost = seshNo*80.00;
        

            if (seshNo >5)
            {
                FinalCost = FinalCost - .2*FinalCost;
            }
            if (ager>=55)
            {
                FinalCost = FinalCost-.15*FinalCost;
            }
        }
        return FinalCost;

    }
}
