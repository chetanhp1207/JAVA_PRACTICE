package constructor_chaining;

public class Dress {
String type;
String color;
String size;
double price;

public Dress(String type) {
	this(type,"Black");
}
public Dress(String type,String color) {
	this(type,color,"xxl");
}
public Dress(String type,String color,String size) {
	this(type,color,size,23456.78);
}


public Dress(String type, String color, String size, double price) {
	this.type = type;
	this.color = color;
	this.size = size;
	this.price = price;
}
public static void main(String[] args) {
	Dress d1=new Dress("Shirt");
	System.out.println(d1.type+" "+d1.color+" "+d1.size+" "+d1.price);
	Dress d2=new Dress("tshirt","blue","m",765.89);
	System.out.println(d2.type+" "+d2.color+" "+d2.size+" "+d2.price);
}
}
