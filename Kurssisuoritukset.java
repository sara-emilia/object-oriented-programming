class Kurssisuoritukset{
    private String nimi;
    private int[] arvosanat;
    
    public Kurssisuoritukset(String nimi){
        this.nimi = nimi;
    }
    
    public void asetaArvosanat(int[] arvosanat) {
        this.arvosanat = arvosanat;
    }
    
    public int annaParas() {
        int max = arvosanat[0];
        for (int i = 0; i < arvosanat.length; i++) {
            if (arvosanat[i] > max) {
                max = arvosanat[i];
            }
        }
        return max;
    }
    
    public double annaKeskiarvo() {
        double summa = 0.0;
        double keskiarvo = 0.0;
        for (int i = 0; i < arvosanat.length; i++) {
            summa = summa + (double)arvosanat[i];
        }
        keskiarvo = summa / (double)arvosanat.length;
        return keskiarvo;
    }
}