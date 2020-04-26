public class Manager extends Employee{
    private int bonus = 0;
    public Manager(String name, int s, int year, int month,int day,int bonus)
    {
        super(name,s,year,month,day);
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        return super.getSalary()+bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public static void main(String[] args)
    {
        Employee[] e = new Employee[3];
        e[0] = new Manager("rose",2000,1988,11,24,20000);
        e[1] = new Employee("jack",5000,1990,11,24);
        e[2] = new Employee("xbb",6000,2017,11,10);
        new Manager("rose",2000,1988,11,24,20000).setBonus(5000);
        //e[0].setBonus(5000);

        for(Employee employee:e)
        {
            System.out.println(employee.getSalary());
        }
        Manager[] m = new Manager[3];
        //m[0] = new Employee("rose1",3000,2019,8,1);
        for (Employee employee:e
             ) {
            if(employee instanceof Manager)
            {
                System.out.println(employee.getName()+" is a manager");
            }
            if(employee instanceof Employee)
            {
                System.out.println(employee.getName()+" is an employee");
            }

        }

    }
}
