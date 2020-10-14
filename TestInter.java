public class TestInter {
    public static void main(String[] args) {
        //Pas
        Kretanje kretanje = new Pass("Dzeki", "Pudla");
        System.out.println(kretanje.toString());
        System.out.println("Nacin kretanja psa je:" + kretanje.kreciSe());
        System.out.println("Pas se oglasava:");
        ( (Oglasavanje) kretanje).oglasiSe();
        //Zec
        Kretanje kretanje1 = new Zec("Zeki", "Beli");
        System.out.println(kretanje1.toString());
        System.out.println("Nacin kretanja zeca je:" + kretanje1.kreciSe());


    }
}