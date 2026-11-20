package collection;

public class Rectangle {
	static Object[] arr1= {1,6,7,3,5};
	static Object[] arr2= {5,1,4,6,8};
	static void area(Object[] abb1,Object[] abb2) {
		for(int i=0;i<abb1.length;i++) {
			int l=(int)abb1[i];
			int b=(int)abb2[i];
			int a=l*b;
			System.out.println(a);
			
		}
	}
	public static void main(String[] args) {
		area(arr1,arr2);
	}
}
