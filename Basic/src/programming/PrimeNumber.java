package programming;

public class PrimeNumber {

	public static void main(String[] args) {

		int  flag = 0;
		int n = 4;// It is the number to check....
		
		if (n == 0 || n == 1) {
			System.out.println(n + "  :  is not a prime number");
		} else {
			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					System.out.println(n + "   :  is not Prime Number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + "  :  is a prime number");
			}
		}
	}

}
