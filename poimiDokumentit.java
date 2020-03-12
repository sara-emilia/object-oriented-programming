public static ArrayList<Dokumentti> poimiDokumentit(ArrayList<TelevisioOhjelma> ohjelmat) {
    ArrayList<Dokumentti> dokumentit = new ArrayList<Dokumentti>();
    for (TelevisioOhjelma tv : ohjelmat) {
        if (tv instanceof Dokumentti) {
            dokumentit.add((Dokumentti)tv);
        }
    }
    return dokumentit;
}