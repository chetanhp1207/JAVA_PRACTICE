package generics;

import java.util.ArrayList;

public class tv {
	int cost;
	String brand;
	String type;
	tv(int cost,String brand,String type){
		this.cost=cost;
	    this.brand=brand;
		this.type=type;
	}
	public String toString() {
		return "tv[cost: "+cost+"   brand: "+brand+"   type:"+type;
	}
	public static void main(String[] args) 
	{
		ArrayList<tv> t1=new ArrayList<tv>();
		t1.add(new tv(25000,"samsung","led"));
		t1.add(new tv(30000,"oneplus","qled"));
		for (int i = 0; i < t1.size(); i++) {
			Object o1=t1.get(i);
			tv t=(tv)o1;
			System.out.println(t);
		}
	}

}
