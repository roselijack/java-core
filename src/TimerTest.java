//import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class TimerTest
{
    public static void main(String[] args)
    {
        ActionListener as = new TimePrinter();
        Timer t = new Timer(1000,as);
        t.start();
        JOptionPane.showMessageDialog(null,"quit?");
        System.exit(0);
    }

}

class TimePrinter implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("now time is:"+new Date());
    }
}