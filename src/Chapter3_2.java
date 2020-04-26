import java.util.Scanner;

public class Chapter3_2 {
	enum Size{SMALL,LARGER,BIGGER};
	public static void CaseTest()
	{
		System.out.println("Would you please input the number");
		Scanner scanner = new Scanner(System.in);
		switch(scanner.nextInt())
		{
			case(1):
				System.out.println("1");
				break;
			case(2):
				System.out.println("2");
				break;
			case(3):
				System.out.println("3");
				break;
			case(4):
				System.out.println("4");
				break;
			default:
				System.out.println("nothing match");
		}
	}
	public static void CaseEnum()
	{
		Size s=Size.LARGER;
		switch(s)
		{
			case SMALL:
				System.out.println(s.toString());
				break;
			case LARGER:
				System.out.println(s.toString());
				break;
			case BIGGER:
				System.out.println(s.toString());
				break;
			default:
				System.out.println("nothing match");		
		}
	}
}
