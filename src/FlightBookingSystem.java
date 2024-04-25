import java.util.ArrayList;
import java.util.List;

public class FlightBookingSystem implements FlightReservationSystem{

    ArrayList<Reservation> rezerwacje = new ArrayList<>();
    ArrayList<Flight> loty = new ArrayList<>();

    @Override
    public void addReservation(Reservation rezerwacja) {
        rezerwacje.add(rezerwacja);
    }

    @Override
    public void cancelReservation(Reservation rezerwacja) {
        rezerwacje.remove(rezerwacja);
    }

    @Override
    public Flight searchFlight(Flight lot) {
        if (loty.contains(lot)) return loty.get(loty.indexOf(lot));
        return null;
    }

    @Override
    public List getAvFlights() {
        return null;
    }
}
