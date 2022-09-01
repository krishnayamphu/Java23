package com.mt.awtdemo.graphics;

import java.awt.*;

public class CanvasDemo extends Canvas {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        int[] x1={400,450,430,390};
        int[] y1={100,150,145,105};
        g.fillPolygon(x1,y1,4);

        g.setColor(new Color(20,20,20));
        int[] x={200,400,350,150};
        int[] y={100,100,150,150};
        g.fillPolygon(x,y,4);

        g.drawRect(160,150,180,100);
        g.fillRect(270,200,40,50);
        g.fillArc(270,180,40,40,0,180);


        int[] x2={390,430,430,340,340};
        int[] y2={105,145,240,250,100};
        g.drawPolygon(x2,y2,5);


    }

    public static void main(String[] args) {
        CanvasDemo canvas=new CanvasDemo();
        Frame f=new Frame();
        f.add(canvas);
        f.setSize(600,400);
        f.setVisible(true);
    }
}
