package vector_list;

import java.util.Vector;

public class Para {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(6);
		v1.add(5);
		v1.add(9);
		Vector v2=new Vector();
		v2.add(10);
		v2.add(7);
		v2.add(5);
		area(v1,v2);
	}
	static void area(Vector v1,Vector v2) {
		for (int i = 0; i < v1.size(); i++) {
			int l=(int)v1.get(i);
			int b=(int)v2.get(i);
			int a=l*b;
			System.out.println("area: "+a);
		}
	}
}
