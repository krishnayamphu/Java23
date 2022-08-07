package com.mt.basic;

public class ArrayTest {
    public static void main(String[] args) {
        int[] num=new int[5];
        num[0]=10;
        num[1]=20;
        num[2]=30;
        num[3]=40;
        num[4]=50;

        for(int i=0; i<5;i++){
            System.out.println(num[i]);
        }

        int[] age={10,11,12,13,14,15};
        for(int i=0; i<5; i++){
            System.out.println(age[i]);
        }

        String[] color={"red","green","blue"};
        for(int i=0; i<3; i++){
            System.out.println(color[i]);
        }
        System.out.println("====================");
        for(String s:color){
            System.out.println("color:"+s);
        }
    }
}
