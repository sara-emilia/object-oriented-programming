class Lukupoikkeus extends Exception{
    
    public Lukupoikkeus(String viesti) {
        super(viesti);
    }
}

class Kirjoituspoikkeus extends Exception {
    
    public Kirjoituspoikkeus(String viesti) {
        super(viesti);
    }
}