package programming;

public class primeNumber_2ndMethod {

	public static void main(String[] args) {
		int num = 5;
		boolean flag = false;

		for (int i = 2; i < num; i++) {
			if (num % 2 == 0) {
				flag = true;
				break;
			}
			if (flag == true) {
				System.out.println("The Number is not a prime Number");
			} else {

				System.out.println("The Number is a prime Number");
				break;
			}
		}
	}

}
