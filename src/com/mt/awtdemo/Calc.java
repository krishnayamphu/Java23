package com.mt.awtdemo;

import com.mt.inheritance.Bike;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calc  extends Frame {
    Label lbln1,lbln2,lblre;
    TextField txtn1,txtn2,txtn3;
    Button btnpls,btnmin,btnmul,btndiv,btnclr;
    double n1,n2;
    public Calc(){
        lbln1=new Label("N1");
        lbln2=new Label("N2");
        lblre=new Label("RE");

        txtn1=new TextField(20);
        txtn2=new TextField(20);
        txtn3=new TextField(20);

        btnpls=new Button(" + ");
        btnmin=new Button(" - ");
        btnmul=new Button(" x ");
        btndiv=new Button(" / ");
        btnclr=new Button("clear");

        add(lbln1); add(txtn1);
        add(lbln2); add(txtn2);
        add(lblre); add(txtn3);

        add(btnpls); add(btnmin);
        add(btnmul); add(btndiv);
        add(btnclr);

        btnpls.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(txtn1.getText());
                n2=Double.parseDouble(txtn2.getText());
                double output=n1+n2;
                txtn3.setText(String.valueOf(output));
            }
        });
        btnmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(txtn1.getText());
                n2=Double.parseDouble(txtn2.getText());
                double output=n1-n2;
                txtn3.setText(String.valueOf(output));
            }
        });

        btnclr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtn1.setText("");
                txtn2.setText("");
                txtn3.setText("");
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setSize(240,200);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calc();
    }
}
