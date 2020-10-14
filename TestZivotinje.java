public class TestZivotinje {
    public static void main(String[] args) {

        Animals zivotinje = new Dog("Jack", "Dalmatinac");
        zivotinje.oglasiSe();
        System.out.println(zivotinje.kretanje());
        System.out.println("----");

        Animals fish = new Fish("jack");
        fish.oglasiSe();
        System.out.println(fish.kretanje());
        System.out.println("----");

        Animals horse = new Horse("Crni");
        horse.oglasiSe();
        System.out.println(horse.kretanje());
        System.out.println("----");
    }
}