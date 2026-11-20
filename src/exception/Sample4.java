package exception;

public class Sample4 {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	try {
		System.out.println(a[4]);
		try {
		}
		catch(ArithmeticException e) {
			System.out.println("caught");
		}
	}
	catch(ArrayIndexOutOfBoundsException e1) {
		System.out.println("handled");
	}
	System.out.println("main ends");
}
}
