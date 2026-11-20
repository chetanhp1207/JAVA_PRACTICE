package Encapsulation;

public class Mainclass5 {
public static void main(String[] args) {
	Gmail g=new Gmail();
	System.out.println(g.getPass());
	g.setPass("hjurr#23");
	System.out.println(g.getPass());
}
}
class Gmail{
	private String pass="Abc@1234";
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass=pass;
	}
}
