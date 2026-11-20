package exception;

public class Sample3 {
public static void main(String[] args) {
	System.out.println("main starts");
	try {
		int a=Integer.parseInt("abc34");
		System.out.println(a);
	}
	catch(NumberFormatException e) {
		System.out.println("handles");
	}
	System.out.println("main ends");
}
}
