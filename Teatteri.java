class Teatteri extends Sali {
    String nimi;
    
    public Teatteri(String nimi, int riveja, int paikkojaRivilla) {
        super(riveja, paikkojaRivilla);
        this.nimi = nimi;
    }
    
    public String annaNimi() {
        return nimi;
    }
    
    public int paikkojaVapaana() {
        int vapaatPaikat = 0;
        for (int i = 0; i < this.annaRivienLkm(); i++) {
            for (int j = 0; j < this.annaPaikkojaRivillaLkm(); j++) {
                if (this.onkoIstuinVapaa(i, j) == true) {
                    vapaatPaikat++;
                }
            }
        }
        return vapaatPaikat;
    }
}