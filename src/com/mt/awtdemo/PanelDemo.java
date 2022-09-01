package com.mt.awtdemo;

import java.awt.*;

public class PanelDemo {
    public static void main(String[] args) {
        Panel p=new Panel();
        p.setBackground(Color.CYAN);

        Frame f=new Frame();
        f.add(p);
        f.setVisible(true);
        f.setSize(300,250);
    }
}
