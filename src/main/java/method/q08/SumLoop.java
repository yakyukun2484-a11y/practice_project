package method.q08;

public class SumLoop {

	public static void main(String[] args) {
		int max = 100;
		int min = 1;
		System.out.println("最小値：" + min);
		System.out.println("最大値：" + max);
		System.out.println("加算結果：" + sumLoop(min, max));

	}

	public static int sumLoop(int a, int b) {
		int sum = 0;

		for (int i = 0; i <= b; i++) {
			sum += i;
		}
		return sum;
	}

}
