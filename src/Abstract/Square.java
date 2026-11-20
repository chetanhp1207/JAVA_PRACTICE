package Abstract;
abstract class Square1{
	abstract void area();
}
class Square2 extends Square1{
	void area() {
		int a=5,c;
		c=a*a;
		System.out.println("Area :"+c);
	}
}
public class Square {
	public static void main(String[] args) {
		Square2 s=new Square2();
		s.area();
	}

}
