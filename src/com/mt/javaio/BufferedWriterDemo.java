package com.mt.javaio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        File file=new File("data.txt");
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter(file));
            bw.write("Welcome to java data handling");
            bw.flush();
            bw.close();
            System.out.println("data write successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
