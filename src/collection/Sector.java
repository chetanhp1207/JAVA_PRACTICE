package collection;

public class Sector {
	static Object[] arr= {4,5,8,9,7};
	static void area(Object[] abb) {
		int theta=15;
		for (int i = 0; i < abb.length; i++) {
			int r=(int)arr[i];
			double res=3.142*r*r*theta;
			System.out.println(res);
		}
	}
	public static void main(String[] args) {
		area(arr);
	}

}
