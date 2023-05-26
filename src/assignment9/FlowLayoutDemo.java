// FlowLayout

package assignment9;

import java.awt.*;
import java.awt.event.*;

public class FlowLayoutDemo extends Frame implements ActionListener {
    TextArea ta;
    TextField tf;
    Label l;
    Button b;

    FlowLayoutDemo()
    {
        super("TextArea Demo");

        l=new Label("No Text Entered ");
        ta=new TextArea(10,30);
        tf=new TextField(20);
        b=new Button("Click");

        setLayout(new FlowLayout());

        add(ta);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        ta.insert(tf.getText(), ta.getCaretPosition());

    }

    public static void main(String[] args) {
        FlowLayoutDemo f=new FlowLayoutDemo();
        f.setSize(500,500);
        f.setVisible(true);
    }

}


