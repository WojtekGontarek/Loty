public class Reservation {

    private Flight lot;
    private String danePosiadacza;
    private float cena;

    public Reservation(Flight lot, String danePosiadacza, float cena) {
        this.lot = lot;
        this.danePosiadacza = danePosiadacza;
        this.cena = cena;
        lot.decreseWojneMiejsca();
    }
}
