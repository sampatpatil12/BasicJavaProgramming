package programming;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		// String s = "rat";
		// String p = "Art";

		String s = "I am GOOD actor";
		String p = "i am bad actor";

		String q1 = s.toLowerCase();
		String r1 = p.toLowerCase();

		String q = q1.replace(" ", "");
		String r = r1.replace(" ", "");

		char[] a = q.toCharArray();
		char[] b = r.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		Boolean result = Arrays.equals(a, b);

		if (result == true) {
			System.out.println("The String is Analgram");
		} else {
			System.out.println("The String is not Analgram");
		}
	}

}
