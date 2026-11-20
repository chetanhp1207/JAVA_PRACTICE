package constructor_chaining;


class Bank {
    Bank() {
        System.out.println("Bank account service started");
    }
}

class Account extends Bank {
    String holder;
    String type;

    Account() {
        this("Chetan");
        System.out.println("Account created");
    }

    Account(String holder) {
        this(holder, "Savings");
        System.out.println("Account holder selected");
    }

    Account(String holder, String type) {
        super();
        this.holder = holder;
        this.type = type;
    }

    public static void main(String[] args) {
        Account a = new Account();
        System.out.println(a.holder + " " + a.type);

        System.out.println("----------");

        Account a1 = new Account("Rahul");
        System.out.println(a1.holder + " " + a1.type);
    }
}