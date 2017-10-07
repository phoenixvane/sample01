package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str[];
        int num;
        str = new String [3];
        str[0] = "zero";
        str[1] = "one";
        str[2] = "two";
        num = new java.util.Random().nextInt(3);
        System.out.println(str[1]);
    }
}
