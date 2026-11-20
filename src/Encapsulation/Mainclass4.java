package Encapsulation;

public class Mainclass4 {
public static void main(String[] args) {
	Upi u=new Upi();
	System.out.println(u.getPin());
	u.setPin(1207);
	System.out.println(u.getPin());
}
}
class Upi{
	private int pin=4567;
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin=pin;
	}
}