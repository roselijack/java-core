package com.eoi;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String name;
    private int salary;
    private LocalDate hireday;

    public Employee(String name, int salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireday = LocalDate.of(year, month, day);
    }
    @Override
    public int compareTo(Employee other)
    {
        return Integer.compare(salary,other.salary);
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (getClass() != otherObject.getClass()) {
            return false;
        }
        Employee other = (Employee) otherObject;
        if (Objects.equals(this.name, other.name) && (this.salary == other.salary) && Objects.equals(this.hireday, other.hireday)) {
            return true;
        } else {
            return false;
        }

    }

    public void raiseSalary()
    {
       this.salary= this.salary*(1+100/100);
    }

    public int hashCode() {
        return Objects.hash(name, salary, hireday);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHireday() {
        return hireday;
    }

    public void setHireday(LocalDate hireday) {
        this.hireday = hireday;
    }

    public String toString()
    {
        return getClass().getName()+"[name="+name+",salary="+salary+",hireday="+hireday+"]";
    }

    public static void main(String[] args)
    {

        ArrayList<Employee> a = new ArrayList<>();
        a.add(new Employee("rose",1000,1988,11,23));
        a.add(new Employee("jack",2000,1988,11,24));
        for(Employee e:a)
        {
            e.raiseSalary();
            System.out.println(e.getName()+","+e.getSalary()+","+e.getHireday());
        }
        System.out.println(a.get(0).compareTo(a.get(1)));

    }
}
