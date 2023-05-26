/*
   4) Design a java application with various layout managers.
*/

package assignment9;

import javax.swing.*;
import java.awt.*;

public class Example4 extends JFrame {
    public Example4()
    {
        super("Layout Manager Demo");
    }

    public static void main(String[] args) {

        Example4 a = new Example4();
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setSize(600, 400);
        a.setLocationRelativeTo(null);
        // Display the window
        a.setVisible(true);
    }
}








