package Abstraction;

interface Train{
	void travel();
}
class Firstclass implements Train{
	public void travel() {
		System.out.println("Firstclass seat");
	}
}
class Sleeper implements Train{
	public void travel() {
		System.out.println("sleeper seat");
	}
}
class Secondclass implements Train{
	public void travel() {
		System.out.println("secondclass seat");
	}
}
class Stimulator4{
	static void using(Train t) {
		t.travel();
	}
}

public class Mainclass4 {
	public static void main(String[] args) {
		Firstclass f=new Firstclass();
		Sleeper s=new Sleeper();
		Secondclass s1=new Secondclass();
		Stimulator4.using(s1);
		Stimulator4.using(s);
		Stimulator4.using(f);
	}

}

