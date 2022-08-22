package com.mt.awtdemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormDemo extends Frame implements ActionListener {
    Button btn,btnclose;
    public FormDemo() {
        btn=new Button("Click Me");
        btnclose=new Button("Close");

        add(btn);
        btn.addActionListener(this);

        add(btnclose);
        btnclose.addActionListener(this);

        setVisible(true);
        setSize(400,300);
        setTitle("Form Demo");
        setResizable(false);
        setLayout(new FlowLayout(FlowLayout.CENTER));
    }

    public static void main(String[] args) {
        new FormDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            System.out.println("Hello World");
        }
        if(e.getSource()==btnclose){
            System.exit(0);
        }
    }
}
