package com.mt.awtdemo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameExample extends Frame {
    Button btn1,btn2;
    TextField txtbox;
    public FrameExample(){
        btn1=new Button("Click");
        btn2=new Button("Show Text");
        txtbox=new TextField(20);
        add(txtbox);
        add(btn1);
        add(btn2);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtbox.setText("Hello World");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=txtbox.getText();
                System.out.println(text);
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
        setSize(400,300);
        setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        new FrameExample();
    }
}
