package com.eoi;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.Objects;

public class ReflectionTest {
    public static void printMethod(Class cl)
    {
        Method[] d = cl.getDeclaredMethods();
        for(Method d1:d)
        {
            System.out.print(Modifier.toString(d1.getModifiers())+" "+d1.getReturnType()+" "+d1.getName()+" (");
            Class[] p = d1.getParameterTypes();
            for(int i=0;i<p.length;i++)
            {
                if(i>0)
                {
                    System.out.print(",");
                }
                System.out.print(p[i].getName());
            }
            System.out.println(")");
        }

    }

    public static void printFields(Class cl)
    {
        Field[] f = cl.getDeclaredFields();
        for(Field f1:f)
        {
            System.out.println(Modifier.toString(f1.getModifiers())+" "+f1.getType().getName()+" "+f1.getName()+";");
        }
    }

    public static void printConstructor(Class cl)
    {
        Constructor[] a = cl.getDeclaredConstructors();
        for(Constructor a1:a)
        {
            System.out.print(Modifier.toString(a1.getModifiers())+" "+a1.getName()+"(");
            Class[] pt=a1.getParameterTypes();
            for(int i=0;i<pt.length;i++)
            {
                if(i>0)
                {
                    System.out.print(",");

                }
                System.out.print(pt[i].getName());
            }
            System.out.println(")");
        }
    }


    public static void main(String[] args)
    {
        String name ="java.lang.Double";

        try {
            Class b = Class.forName(name);
            System.out.print(Modifier.toString(b.getModifiers()));
            System.out.println(" class "+name+" extends "+b.getSuperclass().getName());
            System.out.println("{");
            printConstructor(b);
            printMethod(b);
            printFields(b);
            //String modifier = b.
            //System.out.println();
            //printMethod(b);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
