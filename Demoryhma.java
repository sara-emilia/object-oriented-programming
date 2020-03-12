class Demoryhma {
    private String demonstraattori;
    private int koko;

    public int annaKoko() {
        return koko;
    }
    
    public void asetaKoko(int koko) {
        if (koko < 0) {
            throw new IllegalArgumentException("Annettu koko on negatiivinen luku");
        }
        else {
            this.koko = koko;
        }
    }
    
    public void asetaDemonstraattori(String demonstraattori) {
        if (demonstraattori == null || demonstraattori == "") {
            throw new IllegalArgumentException("Tyhjä tai ei merkkijonoa");
        }
        else {
            this.demonstraattori = demonstraattori;
        }
    }
    
    public String annaDemonstraattori() {
        return demonstraattori;
    }
}