public boolean equals(Object o) {
    Kirja k = (Kirja) o;
    if (o == null) {
        return false;
    }
    else if (k.annaTyylilaji().equals(tyylilaji) && k.annaTyyppi().equals(tyyppi) && k.annaSivumaara() == sivumaara && k.annaNimi().equals(nimi)) {
        return true;
    }
    else {
        return false;
    }
}