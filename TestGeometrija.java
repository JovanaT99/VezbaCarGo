package juniorjava;

public class TestGeometrija {
	public static void main(String[] args) {
		Tacka t1 = new Tacka(4, 5);
		Tacka t2 = new Tacka();

		System.out.println("Tacka t1: " + t1.toString());
		System.out.println("Tacka t2: " + t2.toString());

		t1.x_pomeraj(5);
		System.out.println("Tacka t1 posle pomeraja: " + t1.toString());
		
		Duz duz = new Duz(t1, t2);
		System.out.println("Duz: " + duz.toString());
		System.out.print("Duzina duzi je: " + duz.duzina());
	}
}
