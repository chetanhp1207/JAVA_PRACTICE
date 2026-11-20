package equalsobj;



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
public boolean equals(Object obj) {
		
		laptop e2=(laptop)obj;
		return this.brand==e2.brand;
}
	public static void main(String[] args) 
	{
		laptop e1= new laptop(20000, "hp","elitebook");
		laptop e2= new laptop(25000, "hp","elitebook");
		if(e1.equals(e2)) {
			System.out.println("same same");
			}
			else {
				System.out.println("diff diff");
			}
	}
}