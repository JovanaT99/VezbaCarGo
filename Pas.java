   public class Pas extends Zivotinja {
    public Pas(String ime) {
            this.ime = ime;
            this.rasa="Bernandinac"
        }
        public Pas (String ime, String rasa) {
            super(ime,rasa);
            this.ime = ime;
            this.rasa = rasa;
        }
    public String toString() {
            return ime;
        }
    }
