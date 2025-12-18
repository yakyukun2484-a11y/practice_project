package method.q09;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数を入力してください。");
		int x = stdIn.nextInt();

		if (checkEven(x)) {
			System.out.println(x + "は偶数です。");
		} else {
			System.out.println(x + "は奇数です。");
		}

	}

	public static boolean checkEven(int a) {
		return a % 2 == 0;
	}

}
