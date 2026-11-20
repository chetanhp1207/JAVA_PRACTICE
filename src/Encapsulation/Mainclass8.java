package Encapsulation;

public class Mainclass8 {
public static void main(String[] args) {
	Order o=new Order();
	System.out.println(o.getId());
	o.setId("AA342");
	System.out.println(o.getId());
}
}
class Order{
	String oid="AA123";
	public String getId() {
		return oid;
	}
	public void setId(String oid) {
		this.oid=oid;
	}
}
