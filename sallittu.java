public boolean sallittu() {
    if (pituus >= KalaMitat.MINIMIPITUUS && pituus <= KalaMitat.MAKSIMIPITUUS) {
        if (paino >= KalaMitat.MINIMIPAINO && paino <= KalaMitat.MAKSIMIPAINO) {
            return true;
        }
    }
    return false;
}