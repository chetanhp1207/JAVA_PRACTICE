package generics;

import java.util.ArrayList;

public class cloth {
	int cost;
	String size;
	String color;
	cloth(int cost,String size,String color){
		this.cost=cost;
	    this.size=size;
		this.color=color;
	}
	public String toString() {
		return "cloth[cost: "+cost+"   size: "+size+"   color: "+color+"]";
	}
	public static void main(String[] args) 
	{
		ArrayList<cloth> c1=new ArrayList<cloth>();
		c1.add(new cloth(2000,"XL","red"));
		c1.add(new cloth(1000,"M","black"));
		for (int i = 0; i < c1.size(); i++) {
			Object o1=c1.get(i);
			cloth c=(cloth)o1;
			System.out.println(c);
		}
	}

}
