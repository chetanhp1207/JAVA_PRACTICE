package equalsobj;

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
public boolean equals(Object obj) {
		
		employee e2=(employee)obj;
		return this.grade==e2.grade;
	}
	public static void main(String[] args) 
	{
		employee e1= new employee(111, "abc",'a');
		employee e2= new employee(112, "bgt",'b');
		if(e1.equals(e2)) {
			System.out.println("same same");
			}
			else {
				System.out.println("diff diff");
			}
	}
}
