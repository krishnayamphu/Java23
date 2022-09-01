package com.mt.awtdemo.graphics;

import java.awt.*;

public class MyGraphics extends Frame {
    public MyGraphics(){
        setVisible(true);
        setSize(600,500);
    }
    @Override
    public void paint(Graphics g) {
        g.drawRect(50,50,100,100);
        g.drawOval(200,100,50,50);
        g.setColor(Color.green);
        g.fillOval(50,200,100,100);
        g.drawLine(200,80,400,100);

        int[] x={50,100,200,250,250,200,100,50};
        int[] y={50,30,30,50,150,200,200,150};
        g.drawPolygon(x,y,8);

        g.setColor(Color.red);
        g.fillArc(200,300,100,100,0,180);
    }

    public static void main(String[] args) {
        new MyGraphics();
    }
}
