package Abstraction;


interface Amazon{
	void buy();
}
class Shoes implements Amazon{
	public void buy() {
		System.out.println("bought shoes");
	}
}
class Dress implements Amazon{
	public void buy() {
		System.out.println("bought dress");
	}
}
class Mo implements Amazon{
	public void buy() {
		System.out.println("bought mobiles");
	}
}
class Stimulator22{
	static void purchase(Amazon a) {
		a.buy();
	}
}
public class Mainclass2{
	public static void main(String[] args) {
		Shoes s=new Shoes();
		Dress d=new Dress();
		Mo m=new Mo();
		Stimulator22.purchase(s);
		Stimulator22.purchase(d);
		Stimulator22.purchase(m);
	}
}
