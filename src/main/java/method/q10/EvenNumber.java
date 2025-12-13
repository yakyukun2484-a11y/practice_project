package method.q10;

import java.util.Arrays;

public class EvenNumber {

	public static void main(String[] args) {
		//int [] a = new int[10];
		int[] a = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };
		System.out.println(Arrays.toString(a) + "には、偶数が" + getEvenNumbers(a) + "個あります。");

	}

	public static int getEvenNumbers(int[] numbers) {
		int count = 0;
		for (int num : numbers) {
			if (num % 2 == 0) {
				count++;
			}
		}
		return count;
	}

}
