package collection2;

import java.util.PriorityQueue;

public class P_queue {
public static void main(String[] args) {
	PriorityQueue p1=new PriorityQueue();
	p1.add("hii");
	p1.add("bye");
	p1.add("Hello");
	p1.add("Hii");
	System.out.println(p1);
	System.out.println(p1.size());
	System.out.println(p1.isEmpty());
	//p1.clear();
	System.out.println(p1);
	System.out.println(p1.contains("hii"));
	PriorityQueue p2=new PriorityQueue();
	p2.add("abc");
	p2.add("hii");
	p2.add("good");
	p2.add("bye bye");
	System.out.println(p2);
	//p1.retainAll(p2);
	//System.out.println(p1);
	p1.removeAll(p2);
	System.out.println(p1);
	//p1.addAll(p2);
	//System.out.println(p1);
	
}
}
