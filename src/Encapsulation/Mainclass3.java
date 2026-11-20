package Encapsulation;

public class Mainclass3 {
	public static void main(String[] args) {
		Digilocker d=new Digilocker();
		System.out.println(d.getPin());
		d.setPin(124599);
		System.out.println(d.getPin());
	}

}
class Digilocker{
	private int n=123456;
	public int getPin() {
		return n;
	}
	public void setPin(int n) {
		this.n=n;
	}
}
