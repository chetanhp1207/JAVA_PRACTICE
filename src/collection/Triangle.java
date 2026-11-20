package collection;

public class Triangle {
	static Object[] arr1= {2,9,8,4,5};
	static Object[] arr2= {6,9,4,6,8};
	static void area(Object[] abb1,Object[] abb2) {
		for(int i=0;i<abb1.length;i++) {
			
			int h=(int)abb1[i];
			int b=(int)abb2[i];
			double a=0.5*h*b;
			System.out.println(a);
			
		}
	}
	public static void main(String[] args) {
		area(arr1,arr2);
	}

}
