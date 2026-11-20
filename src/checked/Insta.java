package checked;
class NameException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	NameException(String msg){
		this.msg=msg;
	}
	public String getMessage() {
		return msg;
	}
}
public class Insta {
	static void checkname(String name) throws NameException{
		if(name=="chetan@12") {
			System.out.println("correct name");
		}
			else {
				throw new NameException("invalid name");
			}
		}
	
	public static void main(String[] args) {
		try {
			checkname("chetan@12");
		}
		catch(NameException e) {
			e.getMessage();
		}
	}
}
