class Hedelmapussi implements Tuote {
    private double hinta;
    private String nimi;
    private int paino;
    
    public Hedelmapussi() {

    }
    
    public void asetaHinta(double hinta) {
        this.hinta = hinta;
    }
    
    public double annaHinta() {
        return hinta;
    }
    
    public void asetaNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public String annaNimi() {
        return nimi;
    }
    
    public void asetaPaino(int paino) {
        this.paino = paino;
    }
    
    public int annaPaino() {
        return paino;
    }
    
    public double annaKilohinta() {
        double kilohinta = (double)(hinta/paino);
        return kilohinta;
    }
}