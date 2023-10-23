package programming;

public class Array {

	public static void main(String[] args) {
		int[] a = new int[5];

		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

		System.out.println("a[0]  :  " + a[0]);

		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}

	}

}
