class Trilleri implements Elokuva, Murhamysteeri {
    String nimi;
    int kesto;
    
    public Trilleri(String nimi, int kesto) {
        this.nimi = nimi;
        this.kesto = kesto;
    }
    
    public int annaKesto() {
        return kesto;
    }
    
    public String annaMurhaaja() {
        return nimi;
    }
}