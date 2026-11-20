package Encapsulation;

public class Mainclass7 {
public static void main(String[] args) {
	Shop s=new Shop();
	System.out.println(s.getPrice());
	s.setPrice(67890);
	System.out.println(s.getPrice());
}
}
class Shop{
	private long price=45689;
	public long getPrice() {
		return (price*80/100);
	}
	public void setPrice(long price) {
		this.price=price;
	}
}