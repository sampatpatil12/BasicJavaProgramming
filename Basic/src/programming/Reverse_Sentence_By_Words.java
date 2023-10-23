package programming;

public class Reverse_Sentence_By_Words {

	public static void main(String[] args) {

		String str = "I am good Actor";

		// convert that string into string array...
		String[] a = str.split(" ");
		
		System.out.print("The Original String is : ");
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

		System.out.print("The Reverse String is : ");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}

}
