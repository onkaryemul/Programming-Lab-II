// GridLayout

package assignment9;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayoutDemo extends Frame {
    Button b1,b2,b3,b4,b5,b6;

    public GridLayoutDemo()
    {
        super("Grid Layout Demo");

        setLayout(new GridLayout(3,2,5,5));

        b1=new Button("one");
        b2=new Button("two");
        b3=new Button("three");
        b4=new Button("four");
        b5=new Button("five");
        b6=new Button("six");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {

        GridLayoutDemo f=new GridLayoutDemo();
        f.setSize(500,500);
        f.setVisible(true);

    }

}


