package method.q09;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数を入力してください。");
		int x = stdIn.nextInt();

		if (checkEven(x) == "true") {
			System.out.println(x + "は偶数です。");
		} else {
			System.out.println(x + "は奇数です。");
		}

	}

	public static String checkEven(int a) {
		String check;
		if (a % 2 == 0) {
			check = "true";
		} else {
			check = "false";
		}
		return check;
	}

}
