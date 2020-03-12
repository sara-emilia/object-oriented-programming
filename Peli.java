class Peli {
    private double hinta;
    private String nimi;
    
    public Peli(String nimi, double hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
    }
    
    public void asetaNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public String annaNimi() {
        return nimi;
    }
    
    public void asetaHinta(double hinta) {
        this.hinta = hinta;
    }
    
    public double annaHinta() {
        return hinta;
    }
}

class Videopeli extends Peli {
    private ArrayList<String> tuetutlaitteet;
    
    public Videopeli(String nimi, double hinta) {
        super(nimi, hinta);
    }
    
    public void lisaaTuettuLaite(String laite) {
        tuetutlaitteet = new ArrayList<String>();
        tuetutlaitteet.add(laite);
    }
    
    public boolean onkoTuettuLaite(String laite) {
        boolean tuettu = false;
        if (tuetutlaitteet.contains(laite)) {
            tuettu = true;
        }
        return tuettu;
    }
}