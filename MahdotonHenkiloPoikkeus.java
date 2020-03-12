class MahdotonHenkiloPoikkeus extends Exception {
    Henkilo henkilo;
        
    public MahdotonHenkiloPoikkeus(String viesti) {
        super(viesti);
    }
    public MahdotonHenkiloPoikkeus() {
        super();
    }
    
    public void asetaHenkilo(Henkilo h) {
        this.henkilo = h;
    }
    
    public Henkilo annaHenkilo() {
        return henkilo;
    }
}