package vector_list;

import java.util.Vector;

public class Elipse {
public static void main(String[] args) {
	Vector v1=new Vector();
	v1.add(3);
	v1.add(5);
	v1.add(7);
	Vector v2=new Vector();
	v2.add(7);
	v2.add(8);
	v2.add(6);
	area(v1,v2);
}
static void area(Vector v1,Vector v2) {
	for(int i=0;i<v1.size();i++) {
		int a=(int)v1.get(i);
		int b=(int)v2.get(i);
		double ar=3.142*a*b;
		System.out.println("area :"+ ar);
	}
}
}
