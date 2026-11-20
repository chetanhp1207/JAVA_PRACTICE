package Encapsulation;

public class Mainclass6 {
public static void main(String[] args) {
	City c=new City();
	System.out.println(c.getCity());
	c.setName("Bangalore");
	System.out.println(c.getCity());
}
}
class City{
	private String city="Kumta";
	public String getCity() {
		return city;
	}
	public void setName(String city) {
		this.city=city;
	}
}
