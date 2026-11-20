package constructor_chaining;

class Hotel {
    Hotel() {
        System.out.println("Hotel service started");
    }
}

class RoomBooking extends Hotel {
    String roomType;
    String payment;

    RoomBooking() {
        this("Deluxe");
        System.out.println("Room booking completed");
    }

    RoomBooking(String roomType) {
        this(roomType, "UPI");
        System.out.println("Room type selected");
    }

    RoomBooking(String roomType, String payment) {
        super();
        this.roomType = roomType;
        this.payment = payment;
    }

    public static void main(String[] args) {
        RoomBooking r = new RoomBooking();
        System.out.println(r.roomType + " " + r.payment);

        System.out.println("----------");

        RoomBooking r1 = new RoomBooking("Premium");
        System.out.println(r1.roomType + " " + r1.payment);
    }
}