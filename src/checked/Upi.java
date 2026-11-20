package checked;

class PinException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	PinException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}
}

public class Upi {
	static void checkpin(int pin) throws PinException {
		int pin1 = 1234;
		if (pin == pin1) {
			System.out.println("pin is correct");
		} else {
			throw new PinException("invlaid");
		}
	}

	

	public static void main(String[] args) {
		try {
			checkpin(1234);
		} catch (PinException e) {
			System.out.println(e.getMessage());
		}
	}

}
