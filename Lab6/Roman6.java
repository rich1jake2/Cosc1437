package COSC_Labs.Lab6;

// Importing Packages 
import java.awt.*;
import java.util.*;

import sun.jvm.hotspot.debugger.cdbg.VoidType;

public class Roman6 
{
    // Storing the Roman Numeral and Decimal
    private  String romanNumeral = new String();
    private int deciNumber;
    
    




    public Roman6()
    {
        romanNumeral = "Nulla";
        deciNumber = RomantoDecimal();

    }

    public Roman6(String romanNum)
    {
        romanNumeral = romanNum;
        deciNumber = RomantoDecimal();
    }

    public void setRoman(String RoNum)
    {
        romanNumeral = RoNum;
        deciNumber = RomantoDecimal();

    }
    
    public String getRoman()
    {
        return romanNumeral;
    }

    

    public int RomantoDecimal()
    {
        int sum = 0;
        romanNumeral.toUpperCase();

        for(int i = 0; i <= romanNumeral.length()-1; i++ )
        {
            switch(romanNumeral.charAt(i))
            {
                case 'M':
                    sum += 1000;
                    if ((i>0)&&(romanNumeral.charAt(i-1) == 'C')) 
                    {
                        sum-=200;
                    }
                    break;
                case 'D':
                    sum += 500;
                    if ((i >0)&&(romanNumeral.charAt(i-1) == 'C')  )
                    {
                        sum-=200;
                    }
                    break;
                case 'C':
                    sum = sum + 100;
                    if ((i >0) &&(romanNumeral.charAt(i-1) == 'X')  )
                    {
                        sum-=20;
                    }
                    break;
                case 'L':
                    sum += 50;
                    if ((i >0)&&(romanNumeral.charAt(i-1) == 'X') )
                    {
                        sum-=20;
                    }
                    break;
                case 'X':
                    sum += 10;
                    if ((i >0)&&(romanNumeral.charAt(i-1) == 'I'))
                    {
                        sum-=2;
                    }
                    break;
                case 'V':
                    sum += 5;
                    if ((i >0)&&(romanNumeral.charAt(i-1) == 'I'))
                    {
                        sum-=2;
                    }
                    break;
                case 'I':
                    sum = sum + 1;
                    break;
            }
                

        }

        return sum;  
    }
    
    
    
    
    public int getDecimal()
    {
        return deciNumber;
    }
    
    public String toString()
    {
        return String.format("Roman Numeral is, "+ romanNumeral +"\nDecimal Number is, "+ deciNumber);
    }
}