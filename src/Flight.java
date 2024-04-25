public class Flight {
    private String miejsceDocelowe;
    private String miejsceWylotu;
    private String dataWylotu;
    private int czasTLotu;
    private int wojneMiejsca;

    public Flight(String miejsceDocelowe, String miejsceWylotu, String dataWylotu, int czasTLotu, int wojneMiejsca) {
        this.miejsceDocelowe = miejsceDocelowe;
        this.miejsceWylotu = miejsceWylotu;
        this.dataWylotu = dataWylotu;
        this.czasTLotu = czasTLotu;
        this.wojneMiejsca = wojneMiejsca;
    }

    public String getMiejsceDocelowe() {
        return miejsceDocelowe;
    }

    public void setMiejsceDocelowe(String miejsceDocelowe) {
        this.miejsceDocelowe = miejsceDocelowe;
    }

    public String getMiejsceWylotu() {
        return miejsceWylotu;
    }

    public void setMiejsceWylotu(String miejsceWylotu) {
        this.miejsceWylotu = miejsceWylotu;
    }

    public String getDataWylotu() {
        return dataWylotu;
    }

    public void setDataWylotu(String dataWylotu) {
        this.dataWylotu = dataWylotu;
    }

    public int getCzasTLotu() {
        return czasTLotu;
    }

    public void setCzasTLotu(int czasTLotu) {
        this.czasTLotu = czasTLotu;
    }

    public int getWojneMiejsca() {
        return wojneMiejsca;
    }

    public void setWojneMiejsca(int wojneMiejsca) {
        this.wojneMiejsca = wojneMiejsca;
    }
    public void decreseWojneMiejsca() {
        this.wojneMiejsca--;
    }
}
