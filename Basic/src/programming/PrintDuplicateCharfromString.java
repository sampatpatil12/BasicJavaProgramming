package programming;

public class PrintDuplicateCharfromString {

	public static void main(String[] args) {

		String str = "abcdabc";
		
		// convert that string into char array
		char[] s1 = str.toCharArray();
		System.out.print("The Duplicate charchter in string is :  " );

		for (int i = 0; i < s1.length; i++) {
			for (int j = i + 1; j < s1.length; j++) {
				if (s1[i] == s1[j]) {
					System.out.print(s1[i]+"   ");
				}
			}
		}
	}

}
