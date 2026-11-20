package Interface;

interface Elipse1{
	void area();
	
}
class Elipse2 implements Elipse1{
	public void area() {
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

