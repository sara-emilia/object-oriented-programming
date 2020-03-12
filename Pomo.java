class Pomo extends Tyontekija {
    int golfTunteja;
    
    public void asetaGolfTunteja(int golfTunteja){
        this.golfTunteja = golfTunteja;
    }
    
    public int annaGolfTunteja(){
        return golfTunteja;
    }
    
    public int tuntejaYhteensa() {
        return tunteja + ylityoTunteja + golfTunteja;
    }
}