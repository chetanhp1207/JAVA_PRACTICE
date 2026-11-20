package vector_list;

import java.util.Vector;

public class Sector {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(5);
		v1.add(10);
		v1.add(4);
		v1.add(7);
		v1.add(6);
		area(v1);
	}
	static void area(Vector v2) {
		int theta=15;
		for(int i=0;i<v2.size();i++) {
			int r=(int)v2.get(i);
			double a=3.142*r*r*theta;
			System.out.println("area: "+a);
		}
	}
}