package com.mt.javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        File file=new File("data.txt");
        try {
            PrintWriter pw=new PrintWriter(file);
            pw.write("hello Wolrd");
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        PrintWriter printWriter=new PrintWriter(System.out);
        printWriter.write("Hello");
        printWriter.flush();
        printWriter.close();
    }
}
