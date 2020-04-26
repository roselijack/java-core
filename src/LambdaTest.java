import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest {
    public static void main(String[] args)
        {
        String[] planets = new String[]{"ab3","bbb4","ccccc6","dddd5"};
        System.out.println(Arrays.toString(planets));
        Arrays.sort(planets,(first,second)-> first.length()-second.length());
        System.out.println(Arrays.toString(planets));
        /*Timer timer = new Timer(1000,event-> System.out.println("hello"));
        ActionListener a = event-> System.out.println("hello");
        timer.start();*/

       /* Path first = Paths.get("/usr/bin");
        Comparator<String> comp = (first,second)->first.length()-second.length();*/

         Application ap = new Application();
         ap.init();

    }

   /* public void repeat(String text, int count)
    {
        for (int i = 0; i < count; i++) {
            ActionListener listener = event ->
            {
                System.out.println(i); //will pop up error
            }
        }
    }*/




}

class test implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("rose");
    }
}

class Application
{
      public void init()
      {
          ActionListener listener = event->
          {
              System.out.println(this.toString()+"hello");
          };
          Timer timer = new Timer(1000,System.out::println);
          timer.start();
      }
}