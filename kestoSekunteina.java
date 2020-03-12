public static int kestoSekunteina(Tovi t) {
    int kesto = (t.annaTunnit()*3600 + t.annaMinuutit()*60 + t.annaSekunnit());
    return kesto;
}