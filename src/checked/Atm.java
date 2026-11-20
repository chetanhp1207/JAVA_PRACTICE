package checked;
class BalanceException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	BalanceException(String msg){
		this.msg=msg;
	}
	public String getMessage() {
		return msg;
	}
}
public class Atm {
	static void checkbal() throws BalanceException{
		double bal=234.8;
		if(bal>=500) {
			System.out.println("withdraw money");
		
		}
		else {
			throw new BalanceException("insufficient balance");
		}
	}
	public static void main(String[] args) {
		try {
			checkbal();
		}
		catch(BalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}
