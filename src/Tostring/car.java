package Tostring;
class car
{
	long ccost;
	String modelname;
	String type;
	car(int ccost,String modelname,String type){
		this.ccost=ccost;
	    this.modelname=modelname;
		this.type=type;
	}
	public String toString() {
		return ccost+" "+modelname+" "+type;
	}
	public static void main(String[] args) 
	{
		car e1= new car(6000000, "BMW","petrol");
		System.out.println(e1);
	}
}
