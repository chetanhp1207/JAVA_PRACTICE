package equalsobj;
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
	
	public boolean equals(Object obj) {
		
		bike e2=(bike)obj;
		return this.cost==e2.cost;
	}
	public static void main(String[] args) 
	{
		bike e1= new bike(200000, "unicorn","red");
		bike e2= new bike(200000, "ninja","red");
		if(e1.equals(e2)) {
			System.out.println("same same");
		}
		else {
			System.out.println("diff diff");
		}
	}
}