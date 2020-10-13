public class TestD2 {
    public static void main(String[] args) {

        Caj tea1 = new Caj("Black Tea");
        System.out.println(tea1.toString());
        System.out.println("-----");

        Caj tea2 = new Caj("Hibiskus", 2);
        System.out.println(tea2.toString());
        System.out.println("-----");

        Caj tea3 = new Caj("Nana", 3, true);
        System.out.println(tea3.toString());
        System.out.println("-----");

        Caj tea4 = new Caj("Kamilica", 4, false, 12);
        System.out.println(tea4.toString());
        System.out.println("-----");

        Caj tea5 = new Caj("Visnja", 7, false, 5, 7);
        System.out.println(tea5.toString());
    }
}
