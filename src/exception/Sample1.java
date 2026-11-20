package exception;

public class Sample1 {
public static void main(String[] args) {
	System.out.println("main starts");
	int[] a= {1,2,3,4};
	try {
		System.out.println(a[9]);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("cought");
	}
	System.out.println("main ends");
}
}
