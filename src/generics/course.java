package generics;

import java.util.ArrayList;


public class course {

	int cost;
	String uni_name;
	String course_name;
	course(int cost,String uni_name,String course_name){
		this.cost=cost;
	    this.uni_name=uni_name;
		this.course_name=course_name;
	}
	public String toString() {
		return "course[cost: "+cost+"  university name: "+uni_name+"   coursename"+course_name+"]";
	}
	public static void main(String[] args) 
	{
		ArrayList<course> c1=new ArrayList<course>();
		c1.add(new course(2000, "karnatak university","bca"));
		c1.add(new course(2500,"kuvempu university","bba"));
		for (int i = 0; i <c1.size(); i++) {
			Object o1=c1.get(i);
			course c=(course)o1;
			System.out.println(c);
		}
	}

}
