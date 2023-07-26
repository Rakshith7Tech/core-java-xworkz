public class TicketBookingsTester{
    public static void main(String tb[]){
        TicketBookings booking = new TicketBookings();
        booking.setBookingId(101);
        booking.setNoOfSeats(2);
        booking.setSource("Bangalore");
		System.out.println("Booking ID: " + booking.getBookingId());
        System.out.println("Number of Seats: " + booking.getNoOfSeats());
        System.out.println("Source: " + booking.getSource());
		TicketBookings booking1 = new TicketBookings();
        booking.setDestination("Texas");
        booking.setDate("2023-07-20");
        booking.setTimings("06:00 AM");
        booking.setPnr("ABC123");
		System.out.println("Destination: " + booking.getDestination());
        System.out.println("Date: " + booking.getDate());
        System.out.println("Timings: " + booking.getTimings());
        System.out.println("PNR: " + booking.getPnr());
		TicketBookings booking2 = new TicketBookings();
        booking.setPrice(165900.50);
        booking.setTicketClass("Business");
        booking.setBookingType("Online");
        booking.setTransportName("Flight");
        System.out.println("Price: " + booking.getPrice());
        System.out.println("Ticket Class: " + booking.getTicketClass());
        System.out.println("Booking Type: " + booking.getBookingType());
        System.out.println("Transport Name: " + booking.getTransportName());
    }
}
