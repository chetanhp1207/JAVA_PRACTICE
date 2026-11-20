package vector_list;

import java.util.Vector;

public class Triangle {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(4);
		v1.add(5);
		v1.add(9);
		Vector v2=new Vector();
		v2.add(5);
		v2.add(9);
		v2.add(5);	
		area(v1,v2);
	}
	static void area(Vector v1,Vector v2) {
		for(int i=0;i<v1.size();i++) {
			int h=(int)v1.get(i);
			int b=(int)v2.get(i);
			double ar=0.5*b*h;
			System.out.println("area: "+ar);
		}
	}
}
