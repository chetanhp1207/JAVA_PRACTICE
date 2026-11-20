package equalsobj;



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
public boolean equals(Object obj) {
		
		cloth e2=(cloth)obj;
		return this.cost==e2.cost;
	}

	public static void main(String[] args) 
	{
		cloth e1= new cloth(2000, "xl","red");
		cloth e2= new cloth(2901, "xxl","blue");
		if(e1.equals(e2)) {
			System.out.println("same same");
			}
			else {
				System.out.println("diff diff");
			}
	}
}
