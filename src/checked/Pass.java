package checked;
class PasswordException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String pass;
	PasswordException(String pass){
		this.pass=pass;
		}
	public String getMessage() {
		return pass;
	}
	}


public class Pass {
	static void pssword() throws PasswordException{
		String pass="Abc@1456";
		if(pass.length()>=8) {
			System.out.println("password is okay");
		}
		else {
			throw new PasswordException("enter password again");
		}
	}
public static void main(String[] args) {
	try {
		pssword();
	}
	catch(PasswordException e){
		System.out.println(e.getMessage());
	}
}
}
