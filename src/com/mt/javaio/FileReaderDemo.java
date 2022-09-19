package com.mt.javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        File file=new File("myfile.txt");
        try {
            FileReader reader=new FileReader(file);
            int i;
            while((i=reader.read())!=-1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
