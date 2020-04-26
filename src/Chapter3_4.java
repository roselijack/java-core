public class Chapter3_4
{
    public static void arrays()
    {
        int[] a= new int[100];
        for(int i=0;i<100;i++)
        {
            a[i] = i;

        }
        for(int b:a)
        {
            System.out.println(b);
        }
        System.out.println(a.toString());

        int[] c = {1,2,3};
    }
}
