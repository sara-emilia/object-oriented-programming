public static boolean sisaltyy(Piste piste, Nelio nelio) {
    Piste p = piste;
    Nelio n = nelio;
    Piste alakulma = n.annaSijainti();
    boolean sijainti = false;
    if (p.annaX() >= alakulma.annaX()) {
        if (p.annaY() >= alakulma.annaY()) {
            if (p.annaX() <= (alakulma.annaX() + n.annaSivunPituus())) {
                if (p.annaY() <= (alakulma.annaY() + n.annaSivunPituus())) {
                    sijainti = true;
                }
            }
        }
    }
    return sijainti;
}