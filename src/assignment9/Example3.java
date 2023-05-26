/*
   3) Write a JAVA program to create login application(GUI). If login is successful then
      display user information else display message as “wrong username or password”.
*/

package assignment9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginPage extends JFrame implements ActionListener{
    Container c;
    JLabel nameLabel,passwordLabel;
    JTextField nameField ;
    JPasswordField password ;
    JButton submit ;

    public LoginPage()
    {
        super("Login Page");

        c = getContentPane();
        c.setLayout(null);

        nameLabel = new JLabel("Username : ");
        nameLabel.setSize(80,30);
        nameLabel.setLocation(100, 60);
        c.add(nameLabel);

        nameField = new JTextField();
        nameField.setSize(130,20);
        nameField.setLocation(180, 65);
        c.add(nameField);

        passwordLabel = new JLabel("Password : ");
        passwordLabel.setSize(80,30);
        passwordLabel.setLocation(100,100);
        c.add(passwordLabel);

        password = new JPasswordField();
        password.setSize(130,20);
        password.setLocation(180, 105);
        c.add(password);

        submit = new JButton("Submit");
        submit.setSize(80,30);
        submit.setLocation(180, 200);
        submit.addActionListener(this);
        c.add(submit);

        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String passwordVal = String.valueOf(password.getPassword()) ;

        if (e.getSource().equals(submit))
        {
            if (nameField.getText().equals("admin") && passwordVal.equals("admin123"))
            {
                JOptionPane.showMessageDialog(this,"Login successful!");
                displayUserInfo(nameField.getText());
                System.exit(0);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Wrong username or password");
            }
        }

    }

    private void displayUserInfo(String username) {
        // Replace this with your own logic to display the user information
        JOptionPane.showMessageDialog(this,"User info for " + username);
    }
}


public class Example3 {

    public static void main(String[] args) {
        LoginPage a = new LoginPage();
        a.setSize(new Dimension(500,500));
        a.setResizable(false);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}