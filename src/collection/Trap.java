package collection;

public class Trap {
	static Object[] arr1= {5,9,8,3,5};
	static Object[] arr2= {3,8,4,6,7};
	static Object[] arr3= {4,6,9,1,5};
	static void area(Object[] abb1,Object[] abb2,Object[] abb3) {
		for(int i=0;i<abb1.length;i++) {
			
			int h=(int)abb1[i];
			int b=(int)abb2[i];
			int l=(int)abb3[i];
			double a=0.5*h*(b+l);
			System.out.println(a);
			
		}
	}
	public static void main(String[] args) {
		area(arr1,arr2,arr3);
	}

}
