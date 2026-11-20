package equalsobj;



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
public boolean equals(Object obj) {
		
		home e2=(home)obj;
		return this.cost==e2.cost;
}
	public static void main(String[] args) 
	{
		home e1= new home(1000, "graha","white");
		home e2= new home(2300, "nilaya","yellow");
		if(e1.equals(e2)) {
			System.out.println("same same");
			}
			else {
				System.out.println("diff diff");
			}
	}
}
