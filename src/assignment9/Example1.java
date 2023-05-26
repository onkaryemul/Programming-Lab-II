/*
    1) Create two menu-bars, Menu-A and Menu-B. Menu-A contains 2 menu-items (Up and Down).
       Menu-B has 1 menu-item (Reset).
*/

package assignment9;

import java.awt.*;
import java.awt.event.*;

public class Example1 extends Frame {

    public Example1()
    {
        super("Menu Example");

        // Create the menu bar and menus
        MenuBar menuBar = new MenuBar();
        Menu menuA = new Menu("Menu-A");
        Menu menuB = new Menu("Menu-B");

        // Add menu items to Menu-A
        MenuItem upItem = new MenuItem("Up");
        MenuItem downItem = new MenuItem("Down");
        menuA.add(upItem);
        menuA.add(downItem);

        // Add menu item to Menu-B
        MenuItem resetItem = new MenuItem("Reset");
        menuB.add(resetItem);

        // Add menus to the menu bar
        menuBar.add(menuA);
        menuBar.add(menuB);

        // Set the menu bar for this frame
        setMenuBar(menuBar);

        // Add window listener to handle window closing event
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args){
        Example1 a = new Example1();
        // Set size and make frame visible
        a.setSize(400,300);
        a.setVisible(true);
    }

}

