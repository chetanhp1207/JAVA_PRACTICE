package Tostring;
class school
{
	int strength;
	String schoolname;
	String grade;
	school(int strength,String schoolname,String grade){
		this.strength=strength;
	    this.schoolname=schoolname;
		this.grade=grade;
	}
	public String toString() {
		return strength+" "+schoolname+" "+grade;
	}
	public static void main(String[] args) 
	{
		school e1= new school(2500, "KET","A+");
		System.out.println(e1);
	}
}
