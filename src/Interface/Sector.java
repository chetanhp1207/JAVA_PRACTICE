package Interface;
interface Sector1{
	 void area();
}
class Sector2 implements Sector1{
	public void area() {
		int r=8,theta=20;
		double a=3.142*r*r*theta;
		System.out.println("area :"+a);
		
	}
}
public class Sector {
	public static void main(String[] args) {
		Sector2 s=new Sector2();
		s.area();
	}

}

