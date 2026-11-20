package generics;

import java.util.ArrayList;



public class Bike {
	int cost;
	String brand;
	String color;
	Bike(int cost,String brand,String color){
		this.cost=cost;
	    this.brand=brand;
		this.color=color;
	}
	public String toString() {
		return "Bike[Cost: "+cost+" brand: "+brand+" color: "+color;
	}
	public static void main(String[] args) 
	{
		ArrayList<Bike> b=new ArrayList<Bike>();
		b.add(new Bike(45000,"shine","grey"));
		b.add(new Bike(55000,"activa","white"));
		for (int i = 0; i < b.size(); i++) {
			Object o1=b.get(i);
			Bike b1=(Bike)o1;
			System.out.println(b1);
		}
	}

}
