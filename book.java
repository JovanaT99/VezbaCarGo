package author;
public class Book {

		private String name;
		private Author author;
		private int price;
		
		Book (String name, Author author, int price) {
			this.name = name;
			this.author = author;
			this.price = price;
		}
		//get 
		public String getName() {
			return this.name;
		}
		public Author getAuthor() {
			return this.author;
		}
		public int getPrice() {
			return (int) this.price;
		}
		//set 
		public void setName(String name) {
			this.name = name;	
		}
		public void setAuthor(Author author) {
			this.author = author;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String toString() {
		       return "(" + name.getName() + ", " + author.toString()+ "," +price.getPrice()+")";
		}
}
