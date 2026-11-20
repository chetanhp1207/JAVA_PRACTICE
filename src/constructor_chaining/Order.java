
package constructor_chaining;

class Shopping {
    Shopping() {
        System.out.println("Online Shopping");
    }
}

class Order extends Shopping {
    String brand;
    String payment;

    Order() {
        this("Laptop");
        System.out.println("Order placed");
    }

    Order(String brand) {
        this(brand, "UPI");
        System.out.println("Brand selected");
    }

    Order(String brand, String payment) {
        super();
        this.brand = brand;
        this.payment = payment;
    }

    public static void main(String[] args) {
        Order o = new Order();
        System.out.println(o.brand + " " + o.payment);

       System.out.println("--------");

        Order o1 = new Order("Mobile");
        System.out.println(o1.brand + " " + o1.payment);
        System.out.println("---------");
        Order o2=new Order("cloth","COD");
        System.out.println(o2.brand+" "+o2.payment);
        
    }
}
