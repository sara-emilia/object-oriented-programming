class Kerrostalo extends Talo {
    int kerroksia;
    
    public Kerrostalo(String osoite, double pintaAla, int kerroksia) {
        super(osoite, pintaAla);
        this.kerroksia = kerroksia;
    }
    
    public int annaKerroksia() {
        return kerroksia;
    }
}