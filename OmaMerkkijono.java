class OmaMerkkijono extends Merkkijono {
    String merkkijono;
    
    public OmaMerkkijono(String merkkijono) {
        this.merkkijono = merkkijono;
        mjono = merkkijono;
    }
    
    public String alijono(int alku, int pituus){
        return merkkijono.substring(alku, pituus);
    }
    
    public int laskeMerkit(char merkki) {
        int summa = 0;
        for (int i = 0; i < merkkijono.length(); i++) {
            if (merkkijono.charAt(i) == merkki) {
                summa++;
            }
        }
        return summa;
    }
}