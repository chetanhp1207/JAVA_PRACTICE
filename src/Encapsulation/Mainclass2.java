package Encapsulation;

public class Mainclass2 {
public static void main(String[] args) {
	Flipkart f=new Flipkart();
	System.out.println(f.getName());
	f.setName("CHETANHP");
	System.out.println(f.getName());
}
}
class Flipkart{
	private String name="Chetanhp";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
}
