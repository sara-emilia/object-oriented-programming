class Trio<A, B, C> {
    private A eka;
    private B toka;
    private C kolmas;
    
    public Trio(A eka, B toka, C kolmas) {
        this.eka = eka;
        this.toka = toka;
        this.kolmas = kolmas;
    }
    
    public void asetaEka(A eka){
        this.eka = eka;
    }
    
    public A annaEka() {
        return eka;
    }
    
    public void asetaToka(B toka) {
        this.toka = toka;
    }
    
    public B annaToka() {
        return toka;
    }
    
    public void asetaKolmas(C kolmas) {
        this.kolmas = kolmas;
    }
    
    public C annaKolmas() {
        return kolmas;
    }
}