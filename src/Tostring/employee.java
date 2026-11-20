package Tostring;
class employee 
{
	int empid;
	String empname;
	char grade;
	employee(int empid,String empname,char grade){
		this.empid=empid;
	    this.empname=empname;
		this.grade=grade;
	}
	public String toString() {
		return empid+" "+empname+" "+grade;
	}
	public static void main(String[] args) 
	{
		employee e1= new employee(101, "chetan",'s');
		System.out.println(e1);
	}
}
