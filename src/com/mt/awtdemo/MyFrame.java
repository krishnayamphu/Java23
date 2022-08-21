package com.mt.awtdemo;

import java.awt.*;

public class MyFrame extends Frame {
    private Button btn;
    public MyFrame(){
        btn=new Button("Button");
        setSize(400,300);
        setVisible(true);
        setLayout(new FlowLayout());

        add(btn);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
