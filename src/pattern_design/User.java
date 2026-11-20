package pattern_design;

import java.util.Scanner;

interface Payment{
	void makePayment();
}
class Upi implements Payment{
	public void makePayment() {
		System.out.println("Paying throgh upi");
	}
}
class Creditcard implements Payment{
	public void makePayment() {
		System.out.println("paying throgh credit card");
	}
}
class Debitcard implements Payment{
	public void makePayment() {
		System.out.println("paying through debit card");
	}
}
class COD implements Payment{
	public void makePayment() {
		System.out.println("cash on delvery");
	}
}
class Paying{
	private static Paying option;
	
	private Paying() {
		
	}
	public static Paying getInstace() {
		if(option==null) {
			option=new Paying();
		}
		return option;
	}
	 public void select(Payment p) {
		 p.makePayment();
	}
}

public class User {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
    Upi u1 = new Upi();
    Creditcard c1 = new Creditcard();
    Debitcard d1 = new Debitcard();
    COD co1 = new COD();
    
   
//    System.out.println("1.Upi\n2.Credit card \n3.Debit card\n 4.COd");
//    System.out.println("Enter the payment method");
//    int n=sc.nextInt();
	Paying p1 = Paying.getInstace();
//   switch(n) {
//   case 1: p1.select(u1);
//   			break;
//   case 2:p1.select(c1);
//   			break;
//   case 3:p1.select(d1);
//   			break;
//   case 4:p1.select(co1);
//   			break;
//}
	p1.select(co1);
	p1.select(u1);
   }
   
}

