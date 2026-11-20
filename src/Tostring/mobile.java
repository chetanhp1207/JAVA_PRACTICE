package Tostring;
class mobile 
{
	int mcost;
	String modelname;
	String color;
	mobile(int mcost,String modelname,String color){
		this.mcost=mcost;
	    this.modelname=modelname;
		this.color=color;
	}
	public String toString() {
		return mcost+" "+modelname+" "+color;
	}
	public static void main(String[] args) 
	{
		mobile e1= new mobile(30000, "samsung","white");
		System.out.println(e1);
	}
}
