package Abstract;
abstract class Juice_shop{
	abstract void apple();
	abstract void mango();
}
abstract class Jarr extends Juice_shop{
	void apple() {
		System.out.println("apple juice");
	}
	
}
class Jar11 extends Jarr{
	void mango() {
		System.out.println("mango juice");
	}
}

	

public class Mainclass2 {
	public static void main(String[] args) {
		Jar11 j=new Jar11();
		j.apple();
		j.mango();

}

}
