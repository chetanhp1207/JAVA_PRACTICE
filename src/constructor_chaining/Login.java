package constructor_chaining;

public class Login {
String username;
String email;
String password;
public Login(String username) {
	this(username,"chetanhp@gmail.com");
}
public Login(String username,String email) {
	this(username,email,"Abc@1207");
}
public Login(String username, String email, String password) {
	this.username = username;
	this.email = email;
	this.password = password;
}
public static void main(String[] args) {
	Login l1=new Login("chetan12");
	System.out.println(l1.username+" "+l1.email+" "+l1.password);
	Login l2=new Login("chetan","chp@gmail.com","abc@11");
	System.out.println(l2.username+" "+l2.password+" "+l2.email);
	
}
}
