package array_list;

import java.util.ArrayList;

public class Square {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(2);
		l1.add(12);
		l1.add(8);
		l1.add(10);
		l1.add(4);
		area(l1);
	}
	static void area(ArrayList l2) {
		for(int i=0;i<l2.size();i++) {
			int l=(int)l2.get(i);
			int a=l*l;
			System.out.println("length: "+l+" area: "+a);
			
		}
	}
}
