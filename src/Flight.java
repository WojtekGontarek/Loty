public class Flight {
    private String miejsceDocelowe;
    private String miejsceWylotu;
    private String dataWylotu;
    private int czasTLotu;
    private int wolneMiejsca;

    public Flight(String miejsceDocelowe, String miejsceWylotu, String dataWylotu, int czasTLotu, int wolneMiejsca) {
        this.miejsceDocelowe = miejsceDocelowe;
        this.miejsceWylotu = miejsceWylotu;
        this.dataWylotu = dataWylotu;
        this.czasTLotu = czasTLotu;
        this.wolneMiejsca = wolneMiejsca;
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

    public int getWolneMiejsca() {
        return wolneMiejsca;
    }

    public void setWolneMiejsca(int wolneMiejsca) {
        this.wolneMiejsca = wolneMiejsca;
    }
    public void decreseWolneMiejsca() {
        this.wolneMiejsca--;
    }
}
