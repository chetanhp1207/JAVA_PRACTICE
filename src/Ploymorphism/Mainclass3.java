package Ploymorphism;
class Mobile3{
	void features() {
		System.out.println("some features");
	}
}
class Vivo extends Mobile3{
	void features() {
		System.out.println("camera feature");
	}
}
class Oppo extends Mobile3{
	void features() {
		System.out.println("android feature");
	}
}
class Redmi extends Mobile3{
	void features() {
		System.out.println("gaming feature");
	}
}
class Stimulator3{
	static void buy(Mobile3 m) {
		m.features();
	}
}
public class Mainclass3 {
	public static void main(String[] args) {
		Vivo v=new Vivo();
		Oppo o=new Oppo();
		Redmi r=new Redmi();
		Stimulator3.buy(r);
		Stimulator3.buy(o);
		Stimulator3.buy(v);
	}
	
}
