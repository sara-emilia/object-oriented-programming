public static void tulostaPalloilijat(Urheilija[] urheilijat) {
    for (int i = 0; i < urheilijat.length; i++) {
        Urheilija u = urheilijat[i];
        if (u instanceof Jalkapalloilija == true) {
            System.out.println(u.annaNimi());
        }
        else if (u instanceof Koripalloilija == true) {
            System.out.println(u.annaNimi());
        }
        else if (u instanceof Lentopalloilija == true) {
            System.out.println(u.annaNimi());
        }
        else {
            continue;
        }
    }
}