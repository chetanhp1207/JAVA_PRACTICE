package vector_list;

import java.util.Vector;

public class Trap {
public static void main(String[] args) {
	Vector v1=new Vector();
	v1.add(4);
	v1.add(5);
	v1.add(9);
	Vector v2=new Vector();
	v2.add(5);
	v2.add(9);
	v2.add(5);
	Vector v3=new Vector();
	v3.add(6);
	v3.add(8);
	v3.add(4);
	area(v1,v2,v3);
}
static void area(Vector v1,Vector v2,Vector v3) {
	for(int i=0;i<v1.size();i++) {
		int a=(int)v1.get(i);
		int b=(int)v2.get(i);
		int h=(int)v3.get(i);
		double ar=0.5*(a+b)*h;
		System.out.println("area: "+ar);
	}
}
}
