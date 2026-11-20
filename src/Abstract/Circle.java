package Abstract;
abstract class Circle1{
	abstract void area();
}
class Circle2 extends Circle1
{
	void area() {
		int r=7;
	
		double a=3.142*r*r;
		System.out.println("AREA:"+a);
		
		
	}
}
public class Circle {

public static void main(String[] args) {
	Circle2 c= new Circle2();
	c.area();
}
}
