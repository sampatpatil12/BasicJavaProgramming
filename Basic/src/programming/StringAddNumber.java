package programming;

public class StringAddNumber {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;

		int num = Integer.parseInt(str);

		while (num > 0) {

			sum = sum + num % 10;
			num = num / 10;

		}
		System.out.println("Sum Of Each Digit is :  " + sum);

	}

}
