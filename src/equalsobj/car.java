package equalsobj;



class car
{
	int ccost;
	String modelname;
	String type;
	car(int ccost,String modelname,String type){
		this.ccost=ccost;
	    this.modelname=modelname;
		this.type=type;
	}
public boolean equals(Object obj) {
		
		car e2=(car)obj;
		return this.type==e2.type;
	}

	public static void main(String[] args) 
	{
		car e1= new car(100001, "volvo","petrol");
		car e2= new car(150000, "BMW","petrol");
		if(e1.equals(e2)) {
		System.out.println("same same");
		}
		else {
			System.out.println("diff diff");
		}
	}
}
