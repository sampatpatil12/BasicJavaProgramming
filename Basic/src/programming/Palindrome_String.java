package programming;

public class Palindrome_String {

	public static void main(String[] args) {

		String str = "abba";
		String revstr = "";

		// for (int i = 0; i <= str.length() - 1; i++)
		for (int i = str.length() - 1; i >= 0; i--) {
			revstr = revstr + str.charAt(i);

		}
		if (str.equals(revstr)) {
			System.out.println(str + "   : is a palndrome string");
		} else {
			System.out.println(str + "   : is not a palndrome string");
		}

	}

}
