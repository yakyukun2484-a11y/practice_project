package basic.q06;

import java.util.Scanner;

public class ShowSeasons {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("季節を知りたい月を入力してください");
		int month = stdIn.nextInt();

		switch (month) {
		case 1, 2, 12:
			System.out.println(month + "月は冬です。");
			break;
		case 3, 4, 5:
			System.out.println(month + "月は春です。");
			break;
		case 6, 7, 8:
			System.out.println(month + "月は夏です。");
			break;
		case 9, 10, 11:
			System.out.println(month + "月は秋です。");
			break;
		default:
			System.out.println(month + "月は存在しないです。");
			break;
		}

	}

}
