package juniorjava;
import java.util.Scanner;
public class brojPoena{

		public static void main(String[]args){
		Scanner tastatura= new Scanner(System.in);
		int ocena;
		System.out.println("Unesi ocenu od 1 do 5:");
		ocena=tastatura.nextInt();
		switch(ocena) {
		
		case 1:
			System.out.println("Broj poena je od 0-29.");
			break;
		case 2:
			System.out.println("Broj poena je od 30-49.");
			break;
		case 3:
			System.out.println("Broj poena je od 49-69.");
			break;
		case 4:
			System.out.println("Broj poena je od 69-89.");
			break;
		case 5:
			System.out.println("Broj poena je od 89-100.");
			break;
		}	
		
		if(ocena>5 || ocena<1)
		{
			System.out.print("Ne postoji ocena veca od 5 i manja od 1!");
		}
		}	
		}
