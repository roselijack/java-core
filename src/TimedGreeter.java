import javax.swing.*;

class TimedGreeter extends Greeter
{
    public void greet()
    {
        Timer timer = new Timer(1000,System.out::println);
        timer.start();
    }
    public static void main(String[] args)
    {
        TimedGreeter tg = new TimedGreeter();
        tg.greet();
    }
}