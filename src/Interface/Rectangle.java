package Interface;
interface Rectangle1
{
	void area();
	}
class Rectangle2 implements Rectangle1{
	public void area() {
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