//Interfejs
public class Zec implements Oglasavanje, Kretanje {
    private String ime;
    private String rasa;

    public Zec(String ime, String rasa) {
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
        System.out.println("Zec se ne oglasava");
    }

    public String kreciSe() {
        return SKACE;
    }

    public String toString() {
        return "Zec:" + ime + " " + rasa;
    }
}

