import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LengthComparator implements Comparator<String > {
//sort a string array

    public int compare(String a, String b)
    {
        return a.length()-b.length();
    }
    public static void main(String[] args)
    {
        String[] a = {"aaa","bbbbb","cccc"};
        Arrays.sort(a,new LengthComparator());

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }


    }
    
}
