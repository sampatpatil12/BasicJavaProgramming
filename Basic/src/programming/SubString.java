package programming;

public class SubString {

	public static void main(String[] args) {

		String str = "$12345";
		System.out.println(" The Original String is   :  " + str);

		String str1 = str.substring(1);
		System.out.println("The Removing sign of string is   : " + str1);

		String str2 = str.substring(1, 4);
		System.out.println("The Removing sign of string is   : " + str2);
	}

}
