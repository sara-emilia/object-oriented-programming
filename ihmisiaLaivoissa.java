public static int ihmisiaLaivoissa(ArrayList<Laiva> laivat) {
    int ihmiset = 0;
    for (int i = 0; i < laivat.size(); i++) {
        Laiva laiva = laivat.get(i);
        if (laiva instanceof Laiva) {
            ihmiset = ihmiset + ((Laiva)laiva).annaHenkilosto();
        }
        if (laiva instanceof Matkustajalaiva) {
            ihmiset = ihmiset + ((Matkustajalaiva)laiva).annaMatkustajat();
        }
        if (laiva instanceof Luksusristeilija) {
            ihmiset = ihmiset + ((Luksusristeilija)laiva).annaPalvelijat();
        }
    }
    return ihmiset;
}