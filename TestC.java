public class TestC {
    public static void main(String[] args) {
        Pas pas = new Pas("Dzeki","Vucijak");
        Pas pas2 = new Pas("Jack");
        Zivotinja tif = new Zivotinja("Borcanski slatki psic", "Mik");
        Zivotinja dzonika = new Pas("Dzesi");
        System.out.println( pas.getIme()+ ',' + pas.getRasa());
        System.out.println( pas2.getIme()+ ',' + pas2.getRasa());
        System.out.println(tif.getRasa());
        System.out.println(dzonika.getRasa());
        
    }
}
