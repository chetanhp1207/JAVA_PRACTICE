package generics;

import java.util.ArrayList;

public class laptop {

	int cost;
	String brand;
	String name;
	laptop(int cost,String brand,String name){
		this.cost=cost;
	    this.brand=brand;
		this.name=name;
	}
	public String toString() {
		return "laptop[cost: "+cost+"  brand: "+brand+"   name: "+name+"]";
	}
	public static void main(String[] args) 
	{
		ArrayList<laptop> l1=new ArrayList<laptop>();
		l1.add(new laptop(20000, "hp","elitebook"));
		l1.add(new laptop(30000,"hp","probook"));
		for (int i = 0; i < l1.size(); i++) {
			Object o1=l1.get(i);
			laptop l=(laptop)o1;
			System.out.println(l);
		}
	}
}
