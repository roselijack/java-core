package com.eoi;

import java.util.ArrayList;
import java.util.Objects;

public class Wrapper {
    public static double max(double... values)
    {
        double largest = Double.NEGATIVE_INFINITY;
        for(double v:values)
        {
            if(v>largest)
            {
                largest = v;
            }
        }

        return largest;
    }
    public static void main(String [] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(Integer.valueOf(3));
        int a = list.get(0);
        Integer n = 5;
        //System.out.println(Integer.valueOf(n));
        System.out.println(n);
        System.out.println(max(3.1,40.4,-5));
        System.out.printf("%d %s", new Object[]{new Integer(2),"abc"});



    }
}
