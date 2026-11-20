package collection;

public class Circle {
	static Object[] arr= {3,6,8,2,7};
	static void area(Object[] abb) {
		for (int i = 0; i < abb.length; i++) {
			int r=(int)arr[i];
			double res=3.142*r*r;
			System.out.println(res);
		}
	}
	public static void main(String[] args) {
		area(arr);
	}
}
