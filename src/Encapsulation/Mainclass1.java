package Encapsulation;

public class Mainclass1 {
public static void main(String[] args) {
	Instagram i=new Instagram();
	System.out.println(i.getPass());
	i.setPass("Abc@12367");
	System.out.println(i.getPass());
	
}
}
class Instagram{
	private String p="Abc@123";
	public String getPass() {
		return p;
	}
	public void setPass(String p) {
		this.p=p;
	}
	
}


