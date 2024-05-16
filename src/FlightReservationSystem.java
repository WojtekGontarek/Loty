import java.util.List;

public interface FlightReservationSystem {


    void addReservation(Reservation rezerwacja);

    void cancelReservation(Reservation rezerwacja);

    String searchFlight(Flight lot);

    List getAvFlights();


}
