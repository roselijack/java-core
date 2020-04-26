import java.util.Arrays;

public class Chapter3_5 {
    public static void lottery()
    {

        int total=49;
        int[] numbers = new int[total];
        for(int i=0;i<49;i++)
        {
            numbers[i]=i+1;
        }
        int n = 6;
        int[] result = new int[n];
        for(int i=0;i<n;i++)
        {
            int r =  (int)(Math.random()*total);
            result[i] = numbers[r];
            int temp = numbers[r];
            numbers[r] = numbers[total-1];
            numbers[total-1] = temp;
            total--;
        }
        Arrays.sort(result);
        for(int i:result)
        {
            System.out.println(i);
        }

    }
}
