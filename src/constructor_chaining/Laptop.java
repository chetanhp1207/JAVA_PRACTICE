package constructor_chaining;

public class Laptop {
String brand;
String model;
double price;
public Laptop(String brand) {
	this(brand,"elitebook");
}
public Laptop(String brand,String model) {
	this(brand,model,30000.76);
}
public Laptop(String brand, String model, double price) {
	
	this.brand = brand;
	this.model = model;
	this.price = price;
}
public static void main(String[] args) {
	Laptop l1=new Laptop("hp");
	System.out.println(l1.brand+" "+l1.model+" "+l1.price);
	Laptop l2=new Laptop("hp","probook",40000.54);
	System.out.println(l2.brand+" "+l2.model+" "+l2.price);
}
}
