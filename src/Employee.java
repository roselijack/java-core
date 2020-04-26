import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Employee implements Comparable<Employee>,Cloneable{
   private String name;
   private double salary;
   private Date hireday;


   public Employee(String name,double salary,int year,int month, int day)
   {
      this.name = name;
      this.salary = salary;
      hireday = new Date();

   }
   @Override
   public int compareTo(Employee o) {
      return Double.compare(salary,o.salary);
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   public Date getHireday() {
      return hireday;
   }

   public void setHireday(int year,int month, int day) {
      this.hireday = new GregorianCalendar(year,month -1,day).getTime();
      //Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
      //hireday.setTime(newHireDay.getTime());
   }


   public Employee clone()
   {
      try {
         Employee a = (Employee) super.clone();
         //a.hireday = (Date) this.hireday.clone();
         return a;
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
         Employee o = null;
         return o;
      }

   }

   public static void main(String [] args)
   {
      Employee[] employees = new Employee[2];
      employees[0] = new Employee("ROSE",501,1933,12,2);
      employees[1] = employees[0].clone();
      //employees[1] = employees[0];
      employees[1].setSalary(1000);
      employees[1].setHireday(1988,11,24);
      for (Employee a:employees
      ) {
         System.out.println(a.getName()+","+a.getSalary()+","+a.getHireday());
      }

   }
}
