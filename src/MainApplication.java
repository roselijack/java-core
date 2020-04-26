
public class MainApplication {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chapter3_1.balance();
		//Chapter3_2.CaseEnum();
		//Chapter3_3.BigInteger();
		//Chapter3_4.arrays();
		String[] a= {"abc","abcde","abcce"};
		int count=0;
		for(String aa:a) {
			if(aa.length()==5) {
				count++;
				System.out.println(aa);
			}
			System.out.print(count);
			
		}

	}

}
