package generics;

import java.util.ArrayList;

public class school {
	int strength;
	String schoolname;
	String grade;
	school(int strength,String schoolname,String grade){
		this.strength=strength;
	    this.schoolname=schoolname;
		this.grade=grade;
	}
	public String toString() {
		return "[school strength: "+strength+"   school name: "+schoolname+"   grade: "+grade+"]";
	}
	public static void main(String[] args) 
	{
		ArrayList<school> s1=new ArrayList<school>();
		s1.add(new school(2500, "KET","A+"));
		s1.add(new school(3000,"CET","A"));
		for (int i = 0; i < s1.size(); i++) {
			Object o1=s1.get(i);
			school s=(school)o1;
			System.out.println(s);
		}
	}
}
