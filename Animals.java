public abstract class Animals {

    enum Test {
        HODA,
        SKACE,
        PLIVA
    }

    protected String ime;
    protected String rasa;

    public Animals() {
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getRasa() {
        return rasa;
    }

    public Animals(String zivotinja) {
    }

    public void oglasiSe() {
    }

    public abstract Test kretanje();{

    }
}
