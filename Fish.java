public class Fish extends Animals {
    public Fish() {
        super("Jac");
    }

    public Fish(String ime) {
        super("Fish");
    }

    public Fish(String ime, String vrsta) {
        super("Fish");
    }

    public String toString() {
        return super.toString() + ime;
    }

    public void oglasiSe() {
        System.out.println("Riba se ne oglasava");
    }

    public Test kretanje() {
        return Animals.Test.PLIVA;
    }
}
