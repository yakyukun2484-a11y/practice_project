package method.q06;

public class Circle {

	public static void main(String[] args) {
		double radius = 5.0;
		System.out.println("半径：" + radius);
		System.out.println("円の面積：" + getCircleArea(radius));
	}

	public static double getCircleArea(double a) {
		double area = a * a * 3.14;
		return area;
	}

}
