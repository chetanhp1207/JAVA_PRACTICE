package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_methods {
public static void main(String[] args) {
	Map<Integer,Integer> m=new LinkedHashMap<Integer,Integer>();
	m.put(1,10);
	m.put(2, 20);
	m.put(1, 35);
	//m.remove(1,35);
	Map<Integer,Integer> m1=new LinkedHashMap<Integer,Integer>();
		m1.put(1, 15);
	m1.put(4, 5);
	System.out.println(m);
	System.out.println(m1);
	m.putAll(m1);
	System.out.println(m);
	System.out.println(m1);
	m1.clear();
	System.out.println(m1.isEmpty());
	System.out.println(m.containsKey(2));
	System.out.println(m.containsValue(35));
	System.out.println(m.keySet());
	System.out.println(m.values());
	m.put(5, 40);
	m.put(6,50);
	System.out.println(m);
	m.remove(6);
	System.out.println(m);
	m.remove(4, 5);
	System.out.println(m);
	System.out.println(m);
	m.put(7, 60);
	m.put(8, 90);
	for(Map.Entry<Integer, Integer> enr:m.entrySet()) {
		System.out.print(enr.getKey()+" ");
		System.out.print(enr.getValue()+" ");
		System.out.println();
	}
}
}
