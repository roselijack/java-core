import java.math.BigInteger;
import java.util.Scanner;

public class Chapter3_3 {
	public static void BigInteger()
	{
		System.out.println("please input the total numbers:");
		Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();

		System.out.println("please input the total numbers:");
		int numbers = scanner.nextInt();
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		for(int i=1;i<=numbers;i++)
			lotteryOdds=lotteryOdds.multiply(BigInteger.valueOf(total-i+1)).divide(BigInteger.valueOf(i));
		System.out.println(lotteryOdds);



	}
}
