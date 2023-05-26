/*
    2) Write a java program using swing to display number and factorial of that number.
*/

package assignment10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Example2 extends JFrame implements ActionListener {
    public JLabel inputLabel, outputLabel;
    public JTextField inputField, outputField;
    public JButton calculateButton, clearButton;

    public Example2()
    {
        super("Factorial Calculator");

        // create GUI components
        inputLabel = new JLabel("Enter a number:");
        outputLabel = new JLabel("Factorial:");

        inputField = new JTextField(10);
        outputField = new JTextField(10);
        outputField.setEditable(false);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);

        // create panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(calculateButton);
        buttonPanel.add(clearButton);

        // create panel for input and output fields
        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(2, 2));
        fieldPanel.add(inputLabel);
        fieldPanel.add(inputField);
        fieldPanel.add(outputLabel);
        fieldPanel.add(outputField);

        // add panels to the frame
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(fieldPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == calculateButton)
        {
            try
            {
                int n = Integer.parseInt(inputField.getText());
                long factorial = 1;
                for (int i = 2; i <= n; i++)
                {
                    factorial *= i;
                }
                outputField.setText(Long.toString(factorial));
            } catch (NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(this,
                         "Invalid input: please enter a number.");
            }
        }
        else if (e.getSource() == clearButton)
        {
            inputField.setText("");
            outputField.setText("");
        }
    }

    public static void main(String[] args)
    {
        Example2 a = new Example2();
        a.setSize(300, 150);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

