package Abstract;
abstract class Elipse1{
	abstract void area();
	
}
class Elipse2 extends Elipse1{
	void area() {
		int a=7,b=6;
		double c=3.142*a*b;
		System.out.println("Area: "+c);
	}
}

public class Elipse {
	public static void main(String[] args) {
		Elipse2 e=new Elipse2();
		e.area();
	}

}
