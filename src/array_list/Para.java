package array_list;

import java.util.ArrayList;

public class Para {
	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<>();
		l1.add(5);
		l1.add(4);
		l1.add(8);
		l1.add(10);
		l1.add(12);
		l1.add(6);
		area(l1);
	}
	static void area(ArrayList<Integer> l2) {
		for(int i=0;i<l2.size();i++) {
			int l=(int)l2.get(i);
			int b=(int)l2.get(++i);
			int a=l*b;
			System.out.println("length: "+l+" breadth: "+b+ " area: "+a);
			
		}
	}
	
}
