//overrriding
public class OverRid {
    public void test() {
        System.out.println("Testiranje");

    }
}

class Primer extends OverRid {
    public void test() {
        System.out.println("Testiranje 2");
    }

    public static void main(String[] args) {
        OverRid t = new OverRid();
        t.test();

        OverRid t1 = new Primer();
        t1.test();
    }
}
