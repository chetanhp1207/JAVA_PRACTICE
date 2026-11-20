package exception;

public class Sample9 {
public static void main(String[] args) {
	System.out.println("main starts");
	try {
		int i=1/0;
	}
	catch(Exception e) {
		System.out.println("exception handled");
	}
	/*catch(ArithmeticException e1) {
		System.out.println("exception handled");
	}*/
}
}
