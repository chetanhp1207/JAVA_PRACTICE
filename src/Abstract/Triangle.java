package Abstract;
abstract class Triangle1 {
	abstract void area();
}
class Triangle2 extends Triangle1{
	void area() {
		int b=9,h=7;
		double a=0.5*b*h;
		System.out.println("area :"+a);
	}
}
public class Triangle {
	public static void main(String[] args) {
		Triangle2 t = new Triangle2();
		t.area();
	}

}
