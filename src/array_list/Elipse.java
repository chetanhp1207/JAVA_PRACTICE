package array_list;

import java.util.ArrayList;

public class Elipse {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(5);
		l1.add(4);
		l1.add(8);
		l1.add(10);
		l1.add(12);
		l1.add(6);
		area(l1);
	}
	static void area(ArrayList l2) {
		for(int i=0;i<l2.size();i++) {
			int a=(int)l2.get(i);
			int b=(int)l2.get(++i);
			double ar=3.142*a*b;
			System.out.println("r1: "+a+"r2: "+b+ " area: "+ar);
			
		}
	}
}
