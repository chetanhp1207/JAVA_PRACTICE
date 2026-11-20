package generics;

import java.util.ArrayList;

public class mobile {
	int mcost;
	String modelname;
	String color;
	mobile(int mcost,String modelname,String color){
		this.mcost=mcost;
	    this.modelname=modelname;
		this.color=color;
	}
	public String toString() {
		return "mobile[cost: "+mcost+"   name: "+modelname+"   color: "+color+"]";
	}
	public static void main(String[] args) 
	{
		ArrayList<mobile> m1=new ArrayList<mobile>();
		m1.add(new mobile(30000, "samsung","white"));
		m1.add(new mobile(20000,"redmi","black"));
		for (int i = 0; i < m1.size(); i++) {
			Object o1=m1.get(i);
			mobile m=(mobile)o1;
			System.out.println(m);
		}
	}

}
