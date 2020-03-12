public static ArrayList<Piste> palautaPisteet(int[] xkoord, int[] ykoord) {
    
    ArrayList<Piste> pisteet = new ArrayList<Piste>();

    for (int i = 0; i < xkoord.length; i++) {
        Piste p = new Piste();
        try {
            p.asetaXjaY(xkoord[i], ykoord[i]);
        }
        catch (VirheellinenPistePoikkeus e) {
            p.asetaOletukset();
        }
        finally {
            pisteet.add(p);
        }
    }
    return pisteet;
}