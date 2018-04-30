package com.me;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//step 1 create this class
//step 2 extend class
public class MyWindow extends Frame {

    //step 3 constructor
    public MyWindow(String title) /*throws HeadlessException*/ {
        super(title);

        setSize(500, 140); //step 4
        addWindowListener(new WindowAdapter() {  //step 5

            @Override   //step 6
            public void windowClosed(WindowEvent e) {
                //super.windowClosed(e);
                System.exit(0);  //step 7
            }
        });

    }

            //step 8
            @Override
            public void paint(Graphics g){
            super.paint(g);
            //step 9 add font
            Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
            Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
            g.setFont(sansSerifLarge);
            g.drawString("Example Java Packages", 60, 60);
            g.setFont(sansSerifSmall);
            g.drawString("by program example", 60, 100);

            //step 10 to main

        }



}
