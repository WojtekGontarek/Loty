public class Main {
    public static void main(String[] args) {
        FlightBookingSystem lotnisko = new FlightBookingSystem();
        Flight lotWwaNpl = new Flight("Neapol", "Warszawa", "12-05-2024", 180, 90);
        Flight lotKrkWwa = new Flight("Warszawa", "Kraków", "04-06-2024", 40, 60);
        Flight lotWwaLdn = new Flight("Londyn", "Warszawa", "12-05-2024", 90, 90);
        lotnisko.loty.add(lotWwaNpl);
        lotnisko.loty.add(lotKrkWwa);
        lotnisko.loty.add(lotWwaLdn);

        Reservation rez1 = new Reservation(lotKrkWwa, "Jan Kowalski", 120);
        Reservation rez2 = new Reservation(lotWwaLdn, "Anna Nowak", 230);
        Reservation rez3 = new Reservation(lotWwaNpl, "Daria Nowakowka", 470);

        lotnisko.addReservation(rez1);
        lotnisko.addReservation(rez2);
        lotnisko.addReservation(rez3);


        lotnisko.cancelReservation(rez2);
        System.out.println(lotnisko.searchFlight(lotWwaLdn).getMiejsceDocelowe());

        System.out.println(lotnisko.getAvFlights());

//    nie wiem jakie mialo byc wyszukiwanie wiec zrobilem najbardziej oczywiste
//    to samo z dostepnymi lotami wiec zrobilem ze pokazuje te na ktore sa jeszcze miejsca


    }
}