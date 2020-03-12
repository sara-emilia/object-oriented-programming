public static ArrayList<Kirja> annaDekkariPokkarit(ArrayList<Kirja> kirjat) {
    ArrayList<Kirja> dekkarit = new ArrayList<Kirja>();
    for (int i = 0; i < kirjat.size(); i++) {
        Kirja k = kirjat.get(i);
        if (k.annaTyyppi() == Tyyppi.POKKARI) {
            if (k.annaLaji() == Kirjallisuuslaji.DEKKARI) {
                dekkarit.add(k);
            }
            else {
                continue;
            }
        }
        else {
            continue;
        }
    }
    return dekkarit;
}