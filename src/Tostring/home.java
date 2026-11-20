package Tostring;
class home 
{
	int cost;
	String name;
	String color;
	home(int cost,String name,String color){
		this.cost=cost;
	    this.name=name;
		this.color=color;
	}
	public String toString() {
		return cost+" "+name+" "+color;
	}
	public static void main(String[] args) 
	{
		home e1= new home(1000, "abc","red");
		System.out.println(e1);
	}
}
