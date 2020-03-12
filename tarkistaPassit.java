public static ArrayList<Ihminen> tarkistaPassit(Ihminen[] jono) {
    ArrayList<Ihminen> lapaisemattomat = new ArrayList<Ihminen>();
    for (int i = 0; i < jono.length; i++) {
        Ihminen hlo = jono[i];
        Passi p = hlo.naytaPassi();
        if (p.onkoVaarennetty() == false) {
            if (hlo.haeNimi().equals(p.haeNimi())) {
                continue;
            }
            else {
                lapaisemattomat.add(hlo);
            }
        }
        else {
                lapaisemattomat.add(hlo);
        }
    }
    return lapaisemattomat;
}