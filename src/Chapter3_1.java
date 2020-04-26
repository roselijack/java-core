import java.util.Scanner;

public class Chapter3_1 {

	public static void balance()
	{
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("input balance:");
		  double balance = 0;
		  int year = 0;
		  double intrests = 0;
		  balance = scanner.nextDouble();
		  System.out.println("input intrests:");
		  intrests = scanner.nextDouble();
		  //String input;
		  do
		  {
			  balance += balance*intrests/100;
			  year++;
			  System.out.printf("after %d years old, your balance is %,.2f%n",year,balance);
			  //input = scanner.next();
		  }
		  while(scanner.next().equals("N"));
	}
}
