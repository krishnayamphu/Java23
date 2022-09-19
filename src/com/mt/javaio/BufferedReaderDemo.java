package com.mt.javaio;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        File file=new File("data.txt");
        try {
            int i;
            BufferedReader br=new BufferedReader(new FileReader(file));
            while((i=br.read())!=-1){
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
