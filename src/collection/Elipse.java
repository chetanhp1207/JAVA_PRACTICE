package collection;

public class Elipse {
	static Object[] arr1= {5,9,8,3,5};
	static Object[] arr2= {3,8,4,6,7};
	static void area(Object[] abb1,Object[] abb2) {
		for(int i=0;i<abb1.length;i++) {
			
			int h=(int)abb1[i];
			int b=(int)abb2[i];
			double a=3.142*h*b;
			System.out.println(a);
			
		}
	}
	public static void main(String[] args) {
		area(arr1,arr2);
	}
}
