package exception;

public class Sample5 {
public static void main(String[] args) {
	System.out.println("main starts");
	try {
		int i=1/0;
	}
	catch(ArithmeticException e) {
		int[] a= {4,5,6};
		try {
			System.out.println(a[9]);
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("caught");
		}
	}
	System.out.println("main ends");
}
}
