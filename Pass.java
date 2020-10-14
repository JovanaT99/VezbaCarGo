//Interfejs
public class Pass implements Oglasavanje, Kretanje {
    private String ime;
    private String rasa;

    public Pass(String ime, String rasa) {
        this.ime = ime;
        this.rasa = rasa;
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

    public void oglasiSe() {
        System.out.println("av av");
    }

    public String kreciSe() {
        return HODA;
    }

    public String toString() {
        return "Pas:" + ime + " " + rasa;
    }
}
