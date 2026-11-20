package Tostring;
class cloth
{
	int cost;
	String size;
	String color;
	cloth(int cost,String size,String color){
		this.cost=cost;
	    this.size=size;
		this.color=color;
	}
	public String toString() {
		return cost+" "+size+" "+color;
	}
	public static void main(String[] args) 
	{
		cloth e1= new cloth(2000, "xl","red");
		System.out.println(e1);
	}
}
