package com.eoi;

import java.util.ArrayList;
import java.util.Scanner;

public class Excel {
    public static void main(String[] main) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Please input a number:");
        int number = scann.nextInt();
        int loop = number / 26;
        int reminder = number % 26;
        String[] letter = {"A", "B", "C", "D", "E",
                "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        if (loop == 0) {
            System.out.println(letter[reminder - 1]);
        }
        for (int i = loop / 26; i < loop / 26; i++) {
            System.out.println( letter[i] + reminder);

        }
        ArrayList<String> array = new ArrayList<String>()[][];
        for(int i=0;i<number/26;i++)
        {
            int n=number/6;
            for(int j=0;j<n;j++)


        }
    }
}
