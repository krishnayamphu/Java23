package com.mt.javaio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        File f=new File("myfile.txt");
        try {
            FileWriter writer=new FileWriter(f);
            writer.write("Java IO package");
            writer.flush();
            writer.close();
            System.out.println("data write successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
