package com.mt.awtdemo.graphics;

import java.awt.*;

public class ColorDemo extends Frame {
    public static void main(String[] args) {
        ColorDemo f=new ColorDemo();
        Label lbl=new Label("Sample Text");

        lbl.setForeground(new Color(255,0,0));
        lbl.setBackground(new Color(0,0,0));
        lbl.setFont(new Font("Arial", Font.BOLD,20));

        f.add(lbl);
        f.setSize(300,200);
        f.setVisible(true);

    }
}
