package equalsobj;
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
public boolean equals(Object obj) {
		
		school e2=(school)obj;
		return this.strength==e2.strength;
}
	public static void main(String[] args) 
	{
		school e1= new school(1000, "KET","A+");
		school e2= new school(1010, "CET","A+");
		if(e1.equals(e2)) {
			System.out.println("same same");
			}
			else {
				System.out.println("diff diff");
			}
	}
}
