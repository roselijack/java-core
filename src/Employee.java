import java.time.LocalDate;

public class Employee extends Person {


    public static int number = 0;
    public static int getNumber()
    {
        return number;
    }
    public void setNumber(int n)
    {
        n = number;

    }

    private final String temp="rose";
    private String name;
    private int salary;
    private LocalDate hireDate;
    public Employee(String n,int s,int year,int month,int day)
    {
        super(n);
        salary = s;
        hireDate = LocalDate.of(year,month,day);

    }

    public void getDescription()
    {
        System.out.println("I am an employee");
    }

    public int raiseSalary()
    {
        salary+=this.salary*5/100;
        return salary;
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

    public LocalDate getHireDate()
    {
        return hireDate;
    }
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Chapter3_1.balance();
        //Chapter3_2.CaseEnum();
        //Chapter3_3.BigInteger();
        //Chapter3_4.arrays();
        //Chapter3_5.lottery();
        //Chapter4_2.canlendarTest();
        Employee[] employees = new Employee[3];
        employees[0]=new Employee("jack1",1000,1988,11,24);
        employees[1]=new Employee("rose",2000,1989,12,24);
        employees[2]=new Employee("xbb",3000,1988,10,24);
        for (Employee a:employees
        ) {
            Employee.number++;
            a.setNumber(Employee.number);
            System.out.println(a.getName()+","+a.getSalary()+","+a.getHireDate().getYear()+","+a.getHireDate().getMonth()+","+a.getHireDate().getDayOfMonth());

        }
        System.out.println(Employee.getNumber());
        System.out.println();


    }

}
