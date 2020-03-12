public static Henkilo vanhin(Object[] o) {
    Henkilo vanha = (Henkilo) o[0];
    for (int i = 0; i < o.length; i++) {
        Henkilo vertailu = (Henkilo) o[i];
        if (vanha.annaSyntymavuosi() > vertailu.annaSyntymavuosi()) {
            vanha = vertailu;
        }
    }
    return vanha;
}