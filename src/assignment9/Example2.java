/*
   2) Design a simple admission form using java gui.
*/

package assignment9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Form extends JFrame implements ActionListener {

    public Container c;
    public JLabel nameLabel,prnLabel,genderLabel,maleLabel,femaleLabel,dobLabel,scoreLabel;
    public JComboBox date,month,year;
    public JButton submit ;
    public JTextField nameField,prnField,scoreField;
    public JCheckBox genderMale,genderFemale;

    private String dates[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
            = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
            = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };

    public Form()
    {
        super("Registration Form");

        setBounds(300, 90, 900, 600);

        c = getContentPane();
        c.setLayout(null);

        nameLabel = new JLabel("Name : ");
        nameLabel.setSize(80,30);
        nameLabel.setLocation(100, 60);
        c.add(nameLabel);

        nameField = new JTextField();
        nameField.setSize(80,20);
        nameField.setLocation(180, 65);
        c.add(nameField);

        prnLabel = new JLabel("PRN No : ");
        prnLabel.setSize(80,30);
        prnLabel.setLocation(100,100);
        c.add(prnLabel);

        prnField = new JTextField();
        prnField.setSize(80,20);
        prnField.setLocation(180, 105);
        c.add(prnField);


        dobLabel = new JLabel("DOB : ");
        dobLabel.setSize(80,30);
        dobLabel.setLocation(100, 140);
        c.add(dobLabel);

        date = new JComboBox(dates);
        date.setSize(60, 20);
        date.setLocation(180, 140);
        c.add(date);

        month = new JComboBox(months);
        month.setSize(60, 20);
        month.setLocation(240, 140);
        c.add(month);

        year = new JComboBox(years);
        year.setSize(60, 20);
        year.setLocation(300, 140);
        c.add(year);


        scoreLabel = new JLabel("Score : ");
        scoreLabel.setSize(80,30);
        scoreLabel.setLocation(100, 180);
        c.add(scoreLabel);

        scoreField = new JTextField();
        scoreField.setSize(80,20);
        scoreField.setLocation(180, 185);
        c.add(scoreField);

        genderLabel = new JLabel("Gender : ");
        genderLabel.setSize(80,30);
        genderLabel.setLocation(100,220);
        c.add(genderLabel);

        genderMale = new JCheckBox();
        genderMale.setSize(20,20);
        genderMale.setLocation(180, 225);
        c.add(genderMale);

        maleLabel = new JLabel(" Male");
        maleLabel.setSize(80,30);
        maleLabel.setLocation(200,220);
        c.add(maleLabel);

        genderFemale = new JCheckBox();
        genderFemale.setSize(20,20);
        genderFemale.setLocation(300, 225);
        c.add(genderFemale);

        femaleLabel = new JLabel(" Female");
        femaleLabel.setSize(80,30);
        femaleLabel.setLocation(320,220);
        c.add(femaleLabel);


        submit = new JButton("Submit");
        submit.setSize(80,30);
        submit.setLocation(400, 450);
        submit.addActionListener(this);
        c.add(submit);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == submit)
        {
            System.out.println("Registration Completed !!!");
            System.exit(1);
        }
    }
}

// Driver Code
class Example2 {

    public static void main(String[] args) throws Exception
    {
        Form a = new Form();
        a.setResizable(false);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}