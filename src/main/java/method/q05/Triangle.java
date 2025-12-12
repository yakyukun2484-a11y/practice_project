package method.q05;

public class Triangle {

	public static void main(String[] args) {
		int base = 8;
		int height = 5;
		System.out.println("底辺：" + base);
		System.out.println("高さ：" + height);
		System.out.println("三角形の面積：" + getTriangleArea(base, height));
	}

	public static int getTriangleArea(int a, int b) {
		int area = a * b / 2;
		return area;
	}

}
