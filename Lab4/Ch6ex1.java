/*
    This program will create a gui program to calculate the weighted average of four test scores, with the format 
    test_score_x weight_x
    
    look to page 381 for any more details. 
*/

// Package location to run the program
package COSC_Labs.Lab4;

// Imports necesary to creat the gui program
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ch6ex1 extends JFrame
{
    // creating length and width variables to make a square box 
    private static final int W = 600;
    private static final int L = 600;

    // setting up the private classes to declare variables necessary for gui - since we only have four 
    // Variables to Keep track of, then it's easy to just declare them all here without any loops. Reduces complexity
    private JLabel TestScore, TestWeights, FinalSc, Filler1,Filler2;
    private JTextField T1TF, T2TF, T3TF, T4TF, we1TF, we2TF, we3TF, we4TF, FinalScTF; // T1TF = Test1 Text Field
    private JButton ButtonCalculate,ButtonExit;
    private CalcButtonHandle CBHAND;
    private ExButtonHandle EXHAND;


    public Ch6ex1()
    {
        // Titling the program 
        setTitle("Program to Calculate Weighted Average Test Scores");

        // Instantiating the Jlabel objects  
        TestScore = new JLabel("Ener the Test Scores:", SwingConstants.CENTER);
        TestWeights = new JLabel("Enter the Test weights here (they MUST sum to 1) :", SwingConstants.CENTER);

        // Instantiating the JTF objects 
        T1TF = new JTextField(5);
        T2TF = new JTextField(5);
        T3TF = new JTextField(5);
        T4TF = new JTextField(5);

        we1TF = new JTextField(5);
        we2TF = new JTextField(5);
        we3TF = new JTextField(5);
        we4TF = new JTextField(5);

        // Creating the Proper Buttons for calculation 
        ButtonCalculate = new JButton("Calculate Scores");
        CBHAND = new CalcButtonHandle();
        ButtonCalculate.addActionListener(CBHAND);

        // Exit Button
        ButtonExit = new JButton("Exit");
        EXHAND = new ExButtonHandle();
        ButtonExit.addActionListener(EXHAND);

        // Final Score Print
        FinalSc = new JLabel("Final Weighted Average: ", SwingConstants.CENTER);
        FinalScTF = new JTextField(4);

        // Fillers
        Filler1 = new JLabel("------------------------",SwingConstants.CENTER);
        Filler2 = new JLabel("-------------------------", SwingConstants.CENTER);

        // Creating the container pane
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(8,2,25,25));

        // Adding Content to the content pane 
        pane.add(TestScore);
        pane.add(TestWeights);
        
        // Separated by Tests 
        pane.add(T1TF);
        pane.add(we1TF);

        pane.add(T2TF);
        pane.add(we2TF);

        pane.add(T3TF);
        pane.add(we3TF);

        pane.add(T4TF);
        pane.add(we4TF);

        pane.add(Filler1);
        pane.add(Filler2);

        pane.add(FinalSc);
        pane.add(FinalScTF);


        // Adding Buttons 
        pane.add(ButtonCalculate);
        pane.add(ButtonExit);

        
        
        
        
        


        setSize(W,L);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public class CalcButtonHandle implements ActionListener
    {
        private String FinalString; 
        public void actionPerformed(ActionEvent e)
        {
            double t1, t2, t3, t4, w1, w2,w3, w4 ;
            double FinalWeighted;
            t1 = Double.parseDouble(T1TF.getText());
            t2 = Double.parseDouble(T2TF.getText());
            t3 = Double.parseDouble(T3TF.getText());
            t4 = Double.parseDouble(T4TF.getText());

            w1 = Double.parseDouble(we1TF.getText());
            w2 = Double.parseDouble(we2TF.getText());
            w3 = Double.parseDouble(we3TF.getText());
            w4 = Double.parseDouble(we4TF.getText());

            FinalWeighted = t1*w1 + t2*w2 + t3*w3 + t4*w4;
            FinalString = String.format("%.3f",FinalWeighted );
            FinalScTF.setText(FinalString);

        }
    }
    public class ExButtonHandle implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);


        }
        
    }

    public static void main(String[] args)
    {
        Ch6ex1 ScoreObject = new Ch6ex1();

    }

    

}


