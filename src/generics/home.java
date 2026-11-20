package generics;

import java.util.ArrayList;


public class home {

	int cost;
	String name;
	String color;
	home(int cost,String name,String color){
		this.cost=cost;
	    this.name=name;
		this.color=color;
	}
	public String toString() {
		return "home[cost "+cost+"  name: "+name+" color: "+color+"]";
	}
	public static void main(String[] args) 
	{
		ArrayList<home> h1=new ArrayList<home>();
		h1.add(new home(1000, "abc","red"));
		h1.add(new home(2000,"abb","black"));
		for (int i = 0; i < h1.size(); i++) {
			Object o1=h1.get(i);
			home h=(home)o1;
			System.out.println(h);
		}
	}
}

