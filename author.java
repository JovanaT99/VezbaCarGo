/*Zadatak 2: Napisati dve klase Author( name, email, gender)i
 *Book (name, author, price, quantity)i
 *trecu test klasu.
 */
package author;
public class Author {

	private String name;
	private String email;
	private String gender;
	
	public Author(String name, String email, char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;	
	}
	//get
	public String getName() {
		return this.name;	
	}
	public String getEmail() {
		return this.email;
	}
	public char getGender() {
		return this.gender;	
	}
	//set
	public void setName(String name){
		this.name=name;	
	}
	public void setEmail(String email){
		this.email=email;
	}
	public void setGender(String gender){
		this.gender=gender;	
	}
	public String toString() {
		return name.getName() + ", " + email.getString()+ "," +gender.getGender();	
	}
}
