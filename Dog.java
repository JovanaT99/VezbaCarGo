public class Dog extends Animals {

    //private int kretanje;

    public Dog(String ime) {
        super("Dog");
    }

    public Dog(String ime, String rasa) {
        super("Dog");
    }

    public String toString() {
        return super.toString() + ime + rasa;
    }

    public void oglasiSe() {
        System.out.println("Pas se oglasava sa:" + "AV AV");
    }

    public Test kretanje() {
        return Animals.Test.HODA;
    }
}
