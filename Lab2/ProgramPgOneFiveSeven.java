// Enter the program on page 157-158

/*
    Movie Tickets sales and Charity donations by D.S. Malik
*/
package COSC_Labs.Lab2;
import javax.swing.*;
import java.util.*;
import jdk.nashorn.internal.scripts.JO;

public class ProgramPgOneFiveSeven 
{
    public static void main(String[] args)
    {
        // Step 1 
        String movieName;
        String inputStr;
        String outputStr;

        double adultTicketPrice;
        double childTicketPrice;
        
        int noAdultTicketSold;
        int noChildTicektSold;

        double percentDonation;
        double grossAmount;
        double amountDonated;
        double netSaleAmount;

        movieName = JOptionPane.showInputDialog("Enter the movie name");

        inputStr = JOptionPane.showInputDialog("Enter the price of Adult Ticket");

        adultTicketPrice = Double.parseDouble(inputStr);

        inputStr =  JOptionPane.showInputDialog("Enter the Price of a Child Ticket");

        childTicketPrice = Double.parseDouble(inputStr);

        inputStr = JOptionPane.showInputDialog("Enter the Number of Adult Tickets Sold");

        noAdultTicketSold = Integer.parseInt(inputStr);

        inputStr = JOptionPane.showInputDialog("Enter Number of Child Tickets Sold");

        noChildTicektSold = Integer.parseInt(inputStr);

        inputStr = JOptionPane.showInputDialog("Enter percentage of Donation");

        percentDonation = Double.parseDouble(inputStr);

        grossAmount = adultTicketPrice *noAdultTicketSold + childTicketPrice*noChildTicektSold;

        amountDonated = grossAmount*percentDonation/100;
        netSaleAmount = grossAmount - amountDonated;

        outputStr = "Movie Name" + movieName + "\n"+"Number of Tickets Sold:" + (noAdultTicketSold + noChildTicektSold) + "\n"+"GrossAmount: $" + String.format("%.2f",grossAmount) + "\n"+"Percent of Gross Donated" + String.format("%.2f",percentDonation)
                    + "Amount Donated: $" + String.format("%.2f", amountDonated) + "\n"+"Net Sale: $" + String.format("%.2f", netSaleAmount);
                    JOptionPane.showMessageDialog(null,outputStr,"Theater Sales Data", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}