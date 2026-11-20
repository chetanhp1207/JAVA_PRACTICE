package Tostring;
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
	public String toString() {
		return cost+" "+uni_name+" "+course_name;
	}
	public static void main(String[] args) 
	{
		course e1= new course(2000, "karnatak university","bca");
		System.out.println(e1);
	}
}
