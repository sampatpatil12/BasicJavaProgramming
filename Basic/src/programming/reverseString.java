package programming;

public class reverseString {

	public static void main(String[] args) {

		String str = "sampat";
		System.out.println(str);

//		for(int i=str.length()-1;i>=0;i--)
//			System.out.print(str.charAt(i)+"  ");

		char[] p = str.toCharArray();
		for (int i = p.length - 1; i >= 0; i--) {
			System.out.print(p[i]);
		}
	}

}
