public static Piste kauimpanaOrigosta(Piste[] pisteet) {
    double x;
    double y;
    Piste p = pisteet[0];
    double etaisyys;
    etaisyys = Math.sqrt(p.annaX()*p.annaX() + p.annaY()*p.annaY());
    for (int i = 0; i < pisteet.length; i++) {
        Piste piste = pisteet[i];
        double e = Math.sqrt(piste.annaX()*piste.annaX() + piste.annaY()*piste.annaY());
        if (e > etaisyys) {
            etaisyys = e;
            p = piste;
        }
    }
    return p;
}