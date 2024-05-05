import java.util.List;

public interface FlightReservationSystem {


    void addReservation(Reservation rezerwacja);

    void cancelReservation(Reservation rezerwacja);

    Flight searchFlight(Flight lot);

    List getAvFlights();


}
