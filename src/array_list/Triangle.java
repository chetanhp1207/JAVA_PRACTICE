package array_list;

import java.util.ArrayList;

public class Triangle {
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
			int h=(int)l2.get(i);
			int b=(int)l2.get(++i);
			double a=h*b*0.5;
			System.out.println("height: "+h+" base: "+b+ " area: "+a);
			
		}
	}
}
