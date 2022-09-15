package com.mt.multithreading;


import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class DigitalClock extends JFrame implements Runnable {
    private JTextField txtbox;

    public DigitalClock() {
        initComponent();
    }

    public void initComponent() {
        txtbox = new JTextField();
        add(txtbox);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void showTime() {
        LocalTime time = LocalTime.now();
        int h = time.getHour();
        if (h > 12)
            h = h - 12;
        int m = time.getMinute();
        int s = time.getSecond();
        String data = String.valueOf(h) + " : " + String.valueOf(m) + " : " + String.valueOf(s);
        txtbox.setFont(new Font("arial", Font.PLAIN, 28));
        txtbox.setSize(180, 30);
        txtbox.setText(data);
        txtbox.setEditable(false);
    }

    public static void main(String[] args) {
        Thread t = new Thread(new DigitalClock());
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                showTime();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
