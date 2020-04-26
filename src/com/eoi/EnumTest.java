package com.eoi;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter SMALL,MEDIUM,LARGE,EXTRA_LARGER");
        Size a = Enum.valueOf(Size.class,in.next());
        System.out.println(a.getAbbreviation());
        if(a==Size.SMALL)
        {
            System.out.println("bingo");
        }
        System.out.println();

    }

}

enum Size
{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGER("XL");
    private Size(String abbreviation){this.abbreviation=abbreviation;}
    private String abbreviation;

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}

