package exception;

public class Sample2 {
private static Sample2 s1;

public static void main(String[] args) {
	System.out.println("main starts");
	try {
		s1 = null;
		System.out.println(s1.hashCode());
	}
	catch(NullPointerException e) {
		System.out.println("handled");
	}
	System.out.println("main ends");
}
}
