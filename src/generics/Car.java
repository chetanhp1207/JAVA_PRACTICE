package generics;

import java.util.Vector;


public class Car {
	long ccost;
	String modelname;
	String type;
	Car(long ccost,String modelname,String type){
		this.ccost=ccost;
	    this.modelname=modelname;
		this.type=type;
	}
	public String toString() {
		return "Car[car cost"+ccost+" model name: "+modelname+" type: "+type;
	}
	public static void main(String[] args) 
	{
		Vector<Car> v1=new Vector<Car>();
		v1.add(new Car(450000,"bmw","petrol"));
		v1.add(new Car(500000,"volvo","hybrid"));
		v1.add(new Car(550000,"mercedes","diesel"));
		for(int i=0;i<v1.size();i++) {
			Object o1=v1.get(i);
			Car c1=(Car)o1;
			System.out.println(c1);
			
		}
	}
}
