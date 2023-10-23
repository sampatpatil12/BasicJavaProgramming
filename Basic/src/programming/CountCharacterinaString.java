package programming;

public class CountCharacterinaString {

	public static void main(String[] args) {

		String str = "Learn Code";
		int count = 0;

		for (int i = 0; i <str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
			
		}
		System.out.println("The Total Character in A String is :  " + count);

	}
}
