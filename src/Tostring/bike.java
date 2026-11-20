package Tostring;
class bike
{
	int cost;
	String brand;
	String color;
	bike(int cost,String brand,String color){
		this.cost=cost;
	    this.brand=brand;
		this.color=color;
	}
	public String toString() {
		return cost+" "+brand+" "+color;
	}
	public static void main(String[] args) 
	{
		bike e1= new bike(450000, "shine","grey");
		System.out.println(e1);
	}
}
