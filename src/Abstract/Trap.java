package Abstract;
abstract class Trap1{
	abstract void area();
}
class Trap2 extends Trap1{
	void area() {
		int a=5,b=8,h=7;
		double d=0.5*a*b*h;
		System.out.println("Area :"+d);
	}
}
public class Trap {
public static void main(String[] args) {
	Trap2 t = new Trap2();
	t.area();
}
}
