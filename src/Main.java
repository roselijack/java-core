import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Main {



    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        employees[0] = new Employee("roses",2001,1988,11,24);

        employees[1] = new Employee("rose123",2003,1989,11,24);
        employees[2] = new Employee("rose12345",2002,1989,11,24);
        employees[3] = new Employee("babysd",2001,1990,11,24);
//        //Employee[3] d={a,b,c};
//        Arrays.sort(employees);
//        for(int i=0;i<3;i++)
//        {
//            System.out.println(employees[i].getName()+","+employees[i].getSalary()+","+employees[i].getHireday()+",");
//        }
//        if(employees[0] instanceof Collection)
//        {
//            System.out.println(true);
//        }
//        Employee a = new Employee("ranran",2000,1988,11,24);
//        Employee b = a;
//        b.setSalary(500);
//        System.out.println("a.salary"+a.getSalary());
//        System.out.println("b.salary"+b.getSalary());
//        Employee c = a.clone();

        String service = "~!@#$%^&*()_-+=|\\{}[]:;\"'<>?,./";
        System.out.println(service);
/*
        Arrays.sort(employees, Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
*/
        Arrays.sort(employees, Comparator.comparing(Employee::getName,(x,y)->x.length()-y.length()).reversed());

        for (int i = 0;i<employees.length;i++)
        {
            System.out.println(employees[i].getName()+" "+employees[i].getSalary());
        }


    }
}
