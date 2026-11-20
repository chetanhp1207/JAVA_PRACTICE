package Tostring;
public class tv
{
	int cost;
	String brand;
	String type;
	tv(int cost,String brand,String type){
		this.cost=cost;
	    this.brand=brand;
		this.type=type;
	}
	public String toString() {
		return cost+" "+brand+" "+type;
	}
	public static void main(String[] args) 
	{
		tv e1= new tv(10000, "lg","flat");
		System.out.println(e1);
	}
}
