   public class Pas extends Zivotinja {

            private String ime;
            private String rasa;

    public Pas(String ime) {
            this.ime = "Bernadinac";
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
