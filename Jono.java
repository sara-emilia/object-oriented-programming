class Jono<T> {
    private ArrayList<T> jono;
     
     public Jono() {
         jono  = new ArrayList<T>();
     }
     
     public void lisaa (T alkio) {
         jono.add(alkio);
     }
     
     public T poista() {
         T alkio = jono.get(0);
         jono.remove(0);
         return alkio;
     }
     
     public boolean onAlkioita() {
         if (jono.size() != 0) {
             return true;
         }
         else {
             return false;
         }
     }
 }