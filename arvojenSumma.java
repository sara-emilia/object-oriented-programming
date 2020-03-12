public static int arvojenSumma(HashMap<String, Integer> map, String[] avaimet) {
    int summa = 0;
    for (int i = 0; i < avaimet.length; i++) {
        summa = summa + map.get(avaimet[i]);
    }
    return summa;
}