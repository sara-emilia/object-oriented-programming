public static ArrayList<Opiskelija> maksamatta(ArrayList<Opiskelija> al) {
    ArrayList<Opiskelija> lista = new ArrayList<Opiskelija>();
    for (int i = 0; i < al.size(); i++) {
        Opiskelija stdnt = al.get(i);
        if (stdnt.onkoMaksanut() == false) {
            lista.add(stdnt);
        }
    }
    return lista;
}