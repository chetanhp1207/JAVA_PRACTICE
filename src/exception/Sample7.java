package exception;

public class Sample7 {
public static void main(String[] args) {
	System.out.println("main starts");
	try {
		int i=1/0;
	}
	catch(ArithmeticException e) {
		System.out.println("handling arithmetic exception");
	}
	finally {
		System.out.println("finally block");
	}
	System.out.println("main ends");
}
}
