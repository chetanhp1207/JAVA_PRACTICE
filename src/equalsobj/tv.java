package equalsobj;
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
public boolean equals(Object obj) {
		
		tv e2=(tv)obj;
		return this.cost==e2.cost;
}
	public static void main(String[] args) 
	{
		tv e1= new tv(10000, "lg","qled");
		tv e2= new tv(15000, "samsung","led");
		if(e1.equals(e2)) {
			System.out.println("same same");
			}
			else {
				System.out.println("diff diff");
			}
	}
}