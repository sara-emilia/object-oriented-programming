public static void tulostaParasKortti(ArrayList<Pelikortti> kortit) {
    int max = 0;
    String maa = "";
    for (int i = 0; i < kortit.size(); i++) {
        Pelikortti p = kortit.get(i);
        if (max < p.annaNumero()) {
            max = p.annaNumero();
            maa = p.annaMaa();
        }
    }
    System.out.println(maa + " " + max);
}