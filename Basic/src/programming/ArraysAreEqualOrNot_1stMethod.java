package programming;

import java.util.Arrays;

public class ArraysAreEqualOrNot_1stMethod {

	public static void main(String[] args) {

		int firstArray[] = { 10, 20, 30 };
		int secondArray[] = { 20, 10, 30 };

		Arrays.sort(firstArray);
		Arrays.sort(secondArray);

		System.out.println(Arrays.equals(firstArray, secondArray));

	}

}
