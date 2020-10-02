package juniorjava;
public class Tacka {

	private int x;
	private int y;

	public Tacka(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Tacka() {

	}
	public void x_pomeraj(int pomeraj) {
		x += pomeraj;
	}
	public void y_pomeraj(int pom) {
		y += pom;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString() {
		return "(" + getX() + ", " + getY() + ")";
	
	}
}

