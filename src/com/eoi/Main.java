package com.eoi;

import java.util.Objects;

/**
 * This program demonstrates the equals method.
 * @version 1.12 2012-01-26
 * @author Cay Horstmann
 */
public class Main
{
    public static void main(String[] args)
    {
        String a = "ok";
        Employee alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        //Class c1 = Class.forName(a);
        String b = new String("Ok");
        System.out.println(a.hashCode());
        System.out.println(Objects.hashCode(a));
        //Employee alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        System.out.println(alice1.getClass().getName());
        //System.out.println(Class.forName(Employee));

        System.out.println(int[].class.getName());

        try {
            String s = "java.util.Random";
            Object m = Class.forName(s).newInstance();
            System.out.println(m.getClass().getName());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }




//
//        Employee alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
//        Employee alice2 = alice1;
//        Employee alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
//        Employee bob = new Employee("Bob Brandson", 50000, 1989, 10, 1);
//
//        System.out.println("alice1 == alice2: " + (alice1 == alice2));
//
//        System.out.println("alice1 == alice3: " + (alice1 == alice3));
//
//        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
//
//        System.out.println("alice1.equals(bob): " + alice1.equals(bob));
//
//        System.out.println("bob.toString(): " + bob);
//
//        Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
//        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
//        boss.setBonus(5000);
//        System.out.println("boss.toString(): " + boss);
//        System.out.println("carl.equals(boss): " + carl.equals(boss));
//        System.out.println("alice1.hashCode(): " + alice1.hashCode());
//        System.out.println("alice3.hashCode(): " + alice3.hashCode());
//        System.out.println("bob.hashCode(): " + bob.hashCode());
//        System.out.println("carl.hashCode(): " + carl.hashCode());
    }
}