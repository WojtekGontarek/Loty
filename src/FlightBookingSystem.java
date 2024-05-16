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
    public String searchFlight(Flight lot) {
        if (loty.contains(lot)) return String.format("%s-%s", lot.getMiejsceWylotu(), lot.getMiejsceDocelowe());
        return null;
    }

    @Override
    public List<Flight> getAvFlights() {
        List<Flight> avFlights = new ArrayList<>();
        for (Flight lot: loty){
            if (lot.getWolneMiejsca()>=0){
                avFlights.add(lot);
            }
        }
        return avFlights;
    }
}
