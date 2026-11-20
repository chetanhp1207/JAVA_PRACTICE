package array_list;

import java.util.ArrayList;

public class Trapezium {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(5);
		l1.add(4);
		l1.add(8);
		l1.add(10);
		l1.add(12);
		l1.add(6);
		l1.add(8);
		l1.add(3);
		l1.add(7);
		area(l1);
	}
	static void area(ArrayList l2) {
		for(int i=0;i<l2.size();i++) {
			int l=(int)l2.get(i);
			int b=(int)l2.get(++i);
			int h=(int)l2.get(++i);
			double a=0.5*(l+b)/h;
			System.out.println("length: "+l+"breadth: "+b+" height: "+h+" area: "+a);
			
		}
	}
}
