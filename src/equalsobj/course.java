package equalsobj;
class course
{
	int cost;
	String uni_name;
	String course_name;
	course(int cost,String uni_name,String course_name){
		this.cost=cost;
	    this.uni_name=uni_name;
		this.course_name=course_name;
	}
public boolean equals(Object obj) {
		
		course e2=(course)obj;
		return this.cost==e2.cost;
	}
	public static void main(String[] args) 
	{
		course e1= new course(2000, "kuvempu","bca");
		course e2= new course(2000, "karnatak","bca");
		if(e1.equals(e2)) {
			System.out.println("same same");
			}
			else {
				System.out.println("diff diff");
			}
	}
}
