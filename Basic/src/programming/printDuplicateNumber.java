package programming;

public class printDuplicateNumber {

	public static void main(String[] args) {
		String str = "abcdefedab";

		char[] p = str.toCharArray();

		for (int i = 0; i <= p.length - 1; i++)

		{

			for (int j = i + 1; j <= p.length - 1; j++)

			{
				if (p[i] == p[j])
					System.out.println(p[i]);
			}
		}

	}

}
