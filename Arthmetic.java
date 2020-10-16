public class Arthmetic {
    private String ime;

    protected int add(int a, int b) {
        return a + b;
    }

    public Arthmetic(String ime) {
        this.ime = ime;
    }

    public Arthmetic() {

        super();
    }

    public String getIme() {
        return ime;
    }

    String getName() {
        return "My superclass is:" + " " + super.getClass().getName();
    }
}
