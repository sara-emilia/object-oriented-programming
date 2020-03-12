public static ArrayList<Puu> hylatytPuut(ArrayList<Puu> puut, double minimikorkeus, double maksimikorkeus) {
    
    if (puut == null || puut.isEmpty() == true) {
        throw new IllegalArgumentException("Lista on tyhjä tai null!");
    }
    
    ArrayList<Puu> hylatyt = new ArrayList<Puu>();
    
    for (int i = 0; i < puut.size(); i++) {
        Puu puu = puut.get(i);
        if (puu.annaKorkeus() > maksimikorkeus || puu.annaKorkeus() < minimikorkeus) {
            hylatyt.add(puu);
        }
    }
    return hylatyt;
}