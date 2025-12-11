package basic.q04;

public class ArrayDisplay {

	public static void main(String[] args) {
		String[] fruit = new String[5];
		fruit[0] = "りんご";
		fruit[1] = "ばなな";
		fruit[2] = "みかん";
		fruit[3] = "ぶどう";
		fruit[4] = "すいか";
		//String[] fruit = {"りんご","ばなな","みかん","ぶどう","すいか"};//別解

		for (int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i]);
		}
	}

}
