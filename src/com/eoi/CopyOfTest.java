package com.eoi;
//import net.sf.json.JSONObject;

import java.lang.reflect.Array;

public class CopyOfTest {
    public static Object[] badCopy(Object[] old,int length)
    {
        Object[] new1 = new Object[length];
        System.arraycopy(old,0,new1,0,Math.min(old.length,length));
        return new1;
    }

    public static Object goodCopy(Object[] old,int length)
    {
        Class cl = old.getClass();
        System.out.println(cl.getTypeName());
        if(cl.isArray())
        {
            Class t = cl.getComponentType();
            Object new1 = Array.newInstance(t,length);
            System.arraycopy(old,0,new1,0,Math.min(old.length,length));
            return new1;
        }
        else
            return null;
    }

    public static void main(String[] args)
    {
        Employee[] e = new Employee[3];
        e[0] = new Employee("rose",2000,1922,10,8);
        e[1] = new Employee("rose1",3000,1922,10,8);
        e[2] = new Employee("rose2",4000,1922,10,8);

        //Employee[] b = (Employee[])badCopy(e,3);
        Employee[] c = (Employee[]) goodCopy(e,3);
        for(Employee el:c)
        {
            System.out.println(el.getSalary()+" "+el.getName());
        }

    }
}
