class HotelBooking {
    String guestName, roomType;
    int nights;
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }
}