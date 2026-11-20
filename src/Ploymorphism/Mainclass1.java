package Ploymorphism;
class LG{
	void select() {
		System.out.println("item selected");
	}
}
class Mobiles extends LG {
	void select() {
		System.out.println("mobile selected");
	}
}
class Refrigerator extends LG {
	void select() {
		System.out.println("refrigerator selected");
	}
}
class Television extends LG {
	void select() {
		System.out.println("TV selected");
	}
}
class Stimulator{
	static void buy(LG l) {
		l.select();
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		Mobiles m=new Mobiles();
		Refrigerator r=new Refrigerator();
		Television t=new Television();
		Stimulator.buy(t);
		Stimulator.buy(m);
		Stimulator.buy(r);
	}

}
