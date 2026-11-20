package stringclass;

public class Sample1 {
public static void main(String[] args) {
	String s1="hello";
	String s2="hello";
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));

	String s3=new String("hii");
	String s4=new String("hii");
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
}
}
