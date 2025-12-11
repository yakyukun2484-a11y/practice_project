package basic.q05;

public class FizzBuzz {

	public static void main(String[] args) {
		int x = 100;
		for (int i = 1; i <= x; i++) {
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			}else if (i % 3 == 0) {
				System.out.println("Fizz");
			}else if (i % 5 == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}

	}

}
