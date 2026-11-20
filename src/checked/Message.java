package checked;
class OtpException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	OtpException(String msg){
		this.msg=msg;
	}
	public String getMessage() {
		return msg;
	}
}
public class Message {
	static void getotp(int num) throws OtpException {
	if(num==1234) {
		System.out.println("correct otp");
	}
	else {
		throw new OtpException("invalid otp");
	}
}
	public static void main(String[] args) {
		int n=3456;
		try {
			getotp(n);
		}
		catch(OtpException e) {
			System.out.println(e.getMessage());
		}
	}

}
