package Tostring;
class laptop
{
	int cost;
	String brand;
	String name;
	laptop(int cost,String brand,String name){
		this.cost=cost;
	    this.brand=brand;
		this.name=name;
	}
	public String toString() {
		return cost+" "+brand+" "+name;
	}
	public static void main(String[] args) 
	{
		laptop e1= new laptop(20000, "hp","elitebook");
		System.out.println(e1);
	}
}