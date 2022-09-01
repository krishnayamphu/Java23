package com.mt.awtdemo.layouts;

import java.awt.*;

public class BorderLayoutDemo extends Frame {
    private Button btn1,btn2,btn3,btn4,btn5;
    private BorderLayout bl;
    public BorderLayoutDemo(){
        btn1=new Button("NORTH");
        btn2=new Button("SOUTH");
        btn3=new Button("EAST");
        btn4=new Button("WEST");
        btn5=new Button("CENTER");
        bl=new BorderLayout();

        setLayout(bl);
        add(btn1,BorderLayout.NORTH);
        add(btn2,BorderLayout.SOUTH);
        add(btn3,BorderLayout.EAST);
        add(btn4,BorderLayout.WEST);
        add(btn5,BorderLayout.CENTER);

        setSize(400,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
