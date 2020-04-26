import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassTest {

    public static void main(String[] args)
    {
        TalkingClock tc = new TalkingClock(1000,true);
        tc.start();
    }

}

class TalkingClock
{
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start()
    {
        /*Timer timer = new Timer(interval, e -> {System.out.println("hello");if(beep){
            Toolkit.getDefaultToolkit().beep();}});*/
        ActionListener as = new TimePrinter();
        Timer timer = new Timer(interval,as);
        timer.start();
    }

    public class TimePrinter implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("hello");
            if(beep)Toolkit.getDefaultToolkit().beep();

        }
    }


}

