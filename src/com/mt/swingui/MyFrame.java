package com.mt.swingui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private JButton btn;
    public MyFrame(){
        btn=new JButton("Button");
        add(btn);
        setLayout(new FlowLayout());
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
