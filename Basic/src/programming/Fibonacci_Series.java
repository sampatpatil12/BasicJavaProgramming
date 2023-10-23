package programming;

public class Fibonacci_Series {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 2;

		int n = 5;

		for (int i = 0; i <= n; i++) {
			System.out.print(i + "   ");

			int num = num1 + num2;// 3...5....8...13....21....34
			num1 = num2;
			num2 = num;
			System.out.println(num);

		}

	}

}
