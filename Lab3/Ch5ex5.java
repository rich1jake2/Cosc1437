/*
    Do the exercise on page 320-321 exercise 5
    This should ask a user for a sequence of characters that can correspond to a phone number 
    so it shoud only have 7 numbers, if they put in more than 7 numbers then the program should take only 
    the first 7. Allow them to use upper case, lower case and spaces between words. It should process
    as many phone numbers the user wants
*/
/*
    Idea 1 - have the user enter the number of phone numbers they want to enter
    Idea 2 - Iterate through a while loop unitl the user wants to stop inputting phone numbers
    Idea 3 - For the Dialog box, have multiple inputs available and if they want more then they can 
    ask the system for more spaces. Have the ouput in a new Dialog box or right below the user input 
*/
/*
    Notes - 
    (1) I went with idea 2 since it was easier to show results of all the numbers to convert
    (2) I chose 1 to have the values of Q and Z since that's how it is on older phones according to wikipedia.
    I didn't want to leave any values without a corresponding letter

*/
package Lab3;
import java.util.*;

public class Ch5ex5
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {  
        boolean testTruth = true;
        
        char chrInput; // The characters from the input 
        
        
        int stringLength;

        
        


        while(testTruth)
        {
            // Intializing the chrInput value 
            int chrInt;
            String inputString_forConvert;
            String string_to_print = ""; // String that will be printed after all the numbers are converted
            String temp_stor;

            System.out.println("Enter the phrase you whish to convert into a phone number.");
            System.out.print("If you are finished converting type: 'end' ");
            
            // After requested input we can get the information
            inputString_forConvert = console.nextLine();
            temp_stor = new String(inputString_forConvert);
            
            // Finding the string length to compare with limited number of digits 
            stringLength = inputString_forConvert.length(); 

            // Checking for user defined exit
            if (temp_stor.equals("end") || temp_stor.equals("End") || temp_stor.equals("END"))
            {
                testTruth = false;
                System.out.print("Re-run the program to convert more numbers");
                break;
            }
            
            else
            {
                // Iterating through the indices of the stirng 
                for(int i = 0; i <= (stringLength-1); i++ )
                {
                    chrInput = inputString_forConvert.charAt(i);

                
                
                
                    if (chrInput == 'Q' || chrInput == 'q' || chrInput == 'Z' || chrInput == 'z' )
                    {
                        chrInt = 1;
                        string_to_print = string_to_print + (chrInt);
                    }
                    else if (chrInput == 'A' || chrInput == 'a' || chrInput == 'B' || chrInput == 'b' || chrInput == 'C' || chrInput == 'c' )
                    {
                        chrInt = 2;
                        string_to_print = string_to_print + (chrInt);
                    }
                    else if (chrInput == 'D' || chrInput == 'd' || chrInput == 'E' || chrInput == 'e' || chrInput == 'F' || chrInput == 'f' )
                    {
                        chrInt = 3;
                        string_to_print = string_to_print + (chrInt);
                    }
                    else if (chrInput == 'G' || chrInput == 'g' || chrInput == 'H' || chrInput == 'h' || chrInput == 'I' || chrInput == 'i' )
                    {
                        chrInt = 4;
                        string_to_print = string_to_print + (chrInt);
                    }
                    else if (chrInput == 'J' || chrInput == 'j' || chrInput == 'K' || chrInput == 'k' || chrInput == 'L' || chrInput == 'l' )
                    {
                        chrInt = 5;
                        string_to_print = string_to_print + (chrInt);
                    }
                    else if (chrInput == 'M' || chrInput == 'm' || chrInput == 'N' || chrInput == 'n' || chrInput == 'O' || chrInput == 'o' )
                    {
                        chrInt = 6;
                        string_to_print = string_to_print + (chrInt);
                        
                    }
                    else if (chrInput == 'P' || chrInput == 'p' || chrInput == 'Q' || chrInput == 'q' || chrInput == 'R' || chrInput == 'r' || chrInput == 'S' || chrInput == 's')
                    {
                        chrInt = 7;
                        string_to_print = string_to_print + (chrInt);

                    }
                    else if (chrInput == 'T' || chrInput == 't' || chrInput == 'U' || chrInput == 'u' || chrInput == 'V' || chrInput == 'v' )
                    {
                        chrInt = 8;
                        string_to_print = string_to_print + (chrInt);
                    }
                    
                    // System.out.println(chrInput);
                    else if (chrInput == 'W' || chrInput == 'w' || chrInput == 'Y' || chrInput == 'y' || chrInput == 'X' || chrInput == 'x' )
                    {
                        chrInt = 9;
                        string_to_print = string_to_print + (chrInt);
                    }
                    
                }

                
            }
            string_to_print = "The number you want is: " + string_to_print.substring(0,3) + "-"+ string_to_print.substring(3,7);
            System.out.println(string_to_print);
            System.out.println();
        }

    }


}