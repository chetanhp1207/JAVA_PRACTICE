package collection;

public class Square {
	static Object[] arr= {4,8,9,3,5};
	static void area(Object[] abb) {
		for (int i = 0; i < abb.length; i++) {
			int l=(int)abb[i];
			int a=l*l;
			System.out.println(a);

		}
	}
	public static void main(String[] args) {
		area(arr);
	}
}
