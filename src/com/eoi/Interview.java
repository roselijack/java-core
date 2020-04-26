package com.eoi;

import java.util.Arrays;

public class Interview {
    public static void sort()
    {
        int count;
        int[] arr = {2,3,4,5,1};
        for(int i = 0;i < arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count = arr[i];
                    arr[i] = arr[j];
                    arr[j] = count;
                }

            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void bubble_sort()
    {
        int count;
        int[] arr = {2,3,4,5,1};
        for(int i = 0;i < arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    count = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = count;
                }

            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String [] args)
    {
        bubble_sort();
    }
}
