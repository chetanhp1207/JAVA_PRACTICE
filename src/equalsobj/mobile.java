package equalsobj;
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
public boolean equals(Object obj) {
		
		mobile e2=(mobile)obj;
		return this.mcost==e2.mcost;
}
	public static void main(String[] args) 
	{
		mobile e1= new mobile(10000, "redmi","red");
		mobile e2= new mobile(10000, "oppo","yellow");
		if(e1.equals(e2)) {
			System.out.println("same same");
			}
			else {
				System.out.println("diff diff");
			}
	}
}
