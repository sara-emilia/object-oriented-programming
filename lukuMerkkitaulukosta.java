public static int lukuMerkkitaulukosta(String[] taulu) {
    String str = "";
    int luku;
    for (int i = 0; i < taulu.length; i++) {
        str = str + (taulu[i] + "");
    }
    luku = Integer.parseInt(str);
    return luku;
}