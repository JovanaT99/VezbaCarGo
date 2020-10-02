package juniorjava;
public class Duz {
		private Tacka pocetak;
		private Tacka kraj;	
public Duz(final Tacka pocetak, final Tacka kraj) {
		this.pocetak = pocetak;
		this.kraj = kraj;
		}	
public Tacka getPocetak(){
	 	return this.pocetak;
		}
public Tacka getKraj() {
	 	return this.kraj;
 		}
public void setX(int x) {
		this.x = x;
		}
public void setY(int y) {
		this.y = y;
		}
public double duzina(){
	 	return Math.sqrt(Math.pow((this.kraj.getX()-this.pocetak.getX()),2) + Math.pow(this.kraj.getY()-this.pocetak.getY(),2));
		}
public String toString(){
     		return "Pocetna tacka: " + pocetak.toString() + " ,krajnja tacka: "+ kraj.toString();
  		}
 
}






