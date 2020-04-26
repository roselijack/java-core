package com.eoi;

import java.util.Objects;

public class Manager extends Employee {
    private int bonus;

    public Manager(String name, int salary, int year, int month, int day) {
        super(name, salary, year, month, day);

    }

    @Override
    public boolean equals(Object objects) {
        if (!super.equals(objects)) {
            return false;
        }
        Manager m = (Manager) objects;
        if (this.bonus == m.bonus) {
            return true;
        } else {
            return false;
        }
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public int getSalary(){
        return super.getSalary()+bonus;
    }
    public int hashCode(){
        return super.hashCode()+17*new Double(bonus).hashCode();
    }
    public String toString()
    {
        return super.toString()+"[bonus=]"+bonus+"]";
    }
}
