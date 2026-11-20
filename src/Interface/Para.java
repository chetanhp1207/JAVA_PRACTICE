package Interface;

interface  Para1{
	 void area();
}
class Para2 implements Para1{
	public void area() {
		int a=7,b=6;
		int c=a*b;
		System.out.println("Area :"+c);
	}
}
public class Para {
	public static void main(String[] args) {
		Para2 p=new Para2();
		p.area();
	}

}
