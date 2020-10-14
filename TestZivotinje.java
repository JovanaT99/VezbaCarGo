public class TestZivotinje {
    public static void main(String[] args) {
        //dog
        Animals pas = new Dog("Jack", "Dalmatinac");
        pas.oglasiSe();
        System.out.println("Pas:" + pas.kretanje());
        System.out.println("----");
        //fish
        Animals fish = new Fish("Jack");
        fish.oglasiSe();
        Animals.Test kretanje = Animals.Test.PLIVA;
        System.out.println("Riba:" + fish.kretanje());
        System.out.println("----");
        //horse
        Animals horse = new Horse("Crni");
        horse.oglasiSe();
        System.out.println("Konj:" + horse.kretanje());
        System.out.println("----");
    }
}