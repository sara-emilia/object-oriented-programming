public static void tulostaLevyt(ArrayList<Aanite> levyt) {
    for (int i = 0; i < levyt.size(); i++) {
        Aanite cd = levyt.get(i);
        System.out.println(cd.annaNimi());
        System.out.println(cd.annaEsittaja());
        System.out.println(cd.annaPituus());
        System.out.println(cd.annaRaitoja());
        System.out.println(((CD)cd).annaBonusRaita());
    }
}