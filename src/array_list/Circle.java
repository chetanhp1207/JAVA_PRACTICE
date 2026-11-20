package array_list;

import java.util.ArrayList;

public class Circle {
public static void main(String[] args) {
	ArrayList<Object> l1=new ArrayList<>();
	l1.add(5);
	l1.add(9);
	l1.add(7);
	l1.add(3);
	l1.add(8);
	area(l1);
}
static void area(ArrayList<Object> l2) {
	for(int i=0;i<l2.size();i++) {
		int r=(int)l2.get(i);
		double a=3.142*r*r;
		System.out.println("radius: "+r+" area: "+a);
		
	}
}
}
