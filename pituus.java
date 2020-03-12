public double pituus() {
    int x = p2.annaX() - p1.annaX();
    int y = p2.annaY() - p1.annaY();
    double pituus = Math.sqrt(x*x + y*y);
    return pituus;
}