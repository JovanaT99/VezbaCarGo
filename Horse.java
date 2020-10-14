public class Horse extends Animals {
    public Horse(String ime) {
        super("Bela Griva");
    }

    public Horse(String ime, String rasa) {
        super("Bela griva");
    }

    public void oglasiSe() {
        System.out.println("Konj rze");
    }

    public String kretanje() {
        return HODA;
    }
}
