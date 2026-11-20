
package pattern_design;

public class Singleton {

    interface Payment {
        void makePayment();
    }

    static class Upi implements Payment {
        public void makePayment() {
            System.out.println("UPI");
        }
    }

    static class Creditcard implements Payment {
        public void makePayment() {
            System.out.println("Credit Card");
        }
    }

    static class COD implements Payment {
        public void makePayment() {
            System.out.println("COD");
        }
    }

    static class Pay {

        public static Payment getInstance(String method) {

            if (method.equalsIgnoreCase("UPI")) {
                return new Upi();
            } else if (method.equalsIgnoreCase("Creditcard")) {
                return new Creditcard();
            } else if (method.equalsIgnoreCase("COD")) {
                return new COD();
            } else {
                throw new IllegalArgumentException(
                    "Invalid payment method"
                );
            }
        }
    }

    public static void main(String[] args) {

        Payment p1 = Pay.getInstance("UPI");
        p1.makePayment();

        Payment p2 = Pay.getInstance("COD");
        p2.makePayment();

        Payment p3 = Pay.getInstance("Creditcard");
        p3.makePayment();
    }
}
