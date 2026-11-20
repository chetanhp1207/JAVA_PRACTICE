package Abstract;
abstract class Rectangle1
{
	abstract void area();
	}
class Rectangle2 extends Rectangle1{
	void area() {
		int a=5,b=8;
		int c=a*b;
		System.out.println("area :"+c);
	}
}
public class Rectangle {
public static void main(String[] args) {
	Rectangle2 r=new Rectangle2();
	r.area();
}
}
