package com.mt.awtdemo;

import java.awt.*;

public class FrameDemo {
    public static void main(String[] args) {
        Button btn=new Button("Button");
        Frame f=new Frame();
        f.setSize(300,200);
        f.setVisible(true);
        f.setTitle("Frame Demo");
        f.setResizable(true);
        f.setLayout(new FlowLayout());
        f.add(btn);
    }
}
