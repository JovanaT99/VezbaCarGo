class Resenje {

    public static void main(String args[]) {

        Adder adder = new Adder();

        Arthmetic arthmetic = new Arthmetic();
        System.out.println(arthmetic.getName());
        System.out.println(String.format("%d %d %d", arthmetic.add(12, 30), arthmetic.add(3, 10), arthmetic.add(10, 10)));


    }
}
