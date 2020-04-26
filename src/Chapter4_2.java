import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Chapter4_2 {
    public static void canlendarTest()
    {

     /*   LocalDate a = LocalDate.now();
        LocalDate b = a.plusDays(1000);
        System.out.println(a.getYear()+","+a.getMonthValue()+","+a.getDayOfMonth());

        System.out.println(b.getYear()+","+b.getMonthValue()+","+b.getDayOfMonth());
        GregorianCalendar someDay = new GregorianCalendar(1999,11,31);
        someDay.add(Calendar.DAY_OF_MONTH,1000);
        System.out.println(someDay.get(Calendar.DAY_OF_MONTH)+","+someDay.get(Calendar.YEAR)+","+(someDay.get(Calendar.MONTH)+1));
*/
        LocalDate localDate = LocalDate.now();
        int day = localDate.getDayOfMonth();//if 7/4,then day is 4.start should be 7/1
        LocalDate start = localDate.minusDays(day-1);
        DayOfWeek a = start.getDayOfWeek();
        int a_day = a.getValue();
        System.out.println("  1  2  3  4  5  6  7");
        for(int i=1;i<a_day;i++)
            System.out.print("  ");
        System.out.print("  "+a_day);
        for(int i=1;i<31;i++)
        {
            LocalDate date = start.plusDays(i);
            int day1 = date.getDayOfMonth();
            int day2 = date.getDayOfWeek().getValue();
            if(day2!=1)
            {
                System.out.printf("%3d",day1);
            }
            else
            {
                System.out.printf("\n%3d",day1);
            }
        }
    }
}
