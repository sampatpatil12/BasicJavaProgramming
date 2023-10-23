package programming;

public class swapNumbers {

	public static void main(String[] args) {

		int n1 = 10;

		int n2 = 20;
		int temp;
		System.out.println("The Original Value of n1 is  : -" + n1);
		System.out.println("The Original Value of n2 is  : -" + n2);

		temp = n1;// 10
		n1 = n2;// 20
		System.out.println("The Swapping Value of n1 is  : -" + n1);
		n2 = temp;// 10
		System.out.println("The Swapping Value of n2 is  : -" + n2);

	}

}
