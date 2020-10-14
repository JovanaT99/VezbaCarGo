public abstract class Animals {

    public static final String HODA = "Hoda";
    public static final String SKACE = "Skace";
    public static final String PLIVA = "Pliva";

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

    public abstract String kretanje();

    {

    }
}
