package collection2;
import java.util.LinkedList;
public class Linked_list {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add("hello");
	l1.add(null);
	l1.add('a');
	System.out.println(l1.size());
	System.out.println(l1.contains("hii"));
	System.out.println(l1.get(4));
	LinkedList l2=new LinkedList();
	l2.add(10);
	l2.add(10.5);
	l2.add("hii");
	l2.add(50);
	l1.add(2, "bye");
	//l1.addAll(l2);
	System.out.println(l1);
	System.out.println(l2);
	//l1.remove(3);
	//l1.remove((Object)10);
	System.out.println(l1);
	l1.retainAll(l2);
	l1.removeAll(l2);
	System.out.println(l1.isEmpty());
	//System.out.println(((Object) l1).capacity());
}
}
