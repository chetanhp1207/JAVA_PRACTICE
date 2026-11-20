package Abstract;
abstract class Juice{
	abstract void apple();
	abstract void mango();
}
class Jar extends Juice{
	void apple() {
		System.out.println("apple juice");
	}
	void mango() {
		System.out.println("mango juice");
	}
}

public class Mainclass {
	public static void main(String[] args) {
		Jar j=new Jar();
		j.apple();
		j.mango();
	}

}
