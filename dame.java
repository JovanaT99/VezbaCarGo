// Matrice
// N dama na tabli N x N
// Zadatak je bio da se upise do 15 kraljica
//Resenje zahteva da dve dame ne dele istu vrstu,kolonu ni dijagolanu
package juniorjava;
import java.util.Scanner;
public class kraljice {
		Scanner unos=new Scanner(System.in);

	    int brojKraljica =unos.nextInt();
	    
	    void izlaz(int tabla[][]) 
	    { 
	        for (int i = 0; i < brojKraljica; i++) { 
	            for (int j = 0; j < brojKraljica; j++) 
	                System.out.print(" " + tabla[i][j] + " "); 
	            System.out.println(); 
	        	} 
	    } 
	    boolean sigurnaPolja(int tabla[][], int red, int col) 
	    { 
	        int i; 
	        int j;
	        
	        for (i = 0; i <col; i++) 
	            if (tabla[red][i] == 1) 
	                return false; 
	        for (i = red, j = col; i >= 0 && j >= 0; i--, j--) 
	            if (tabla[i][j] == 1) 
	                return false; 
	        for (i = red, j = col; j >= 0 && i < brojKraljica; i++, j--) 
	            if (tabla[i][j] == 1) 
	                return false; 
	        		return true; 
	    			} 
	    		boolean resenjebrojkraljica(int tabla[][], int col) 
	    			{ 
	        
	        if (col >= brojKraljica) 
	            return true; 
	        
	        for (int i = 0; i < brojKraljica; i++) { 
	            
	            if (sigurnaPolja(tabla, i, col)) { 
	                
	                tabla[i][col] = 1; 
	  
	               
	                if (resenjebrojkraljica(tabla, col + 1) == true) 
	                    return true; 
	  
	              
	                tabla[i][col] = 0; 
	            } 
	        	} 
	        		return false; 
	    		} 
	  
	    			boolean resenjeKraljica() 
	    		{ 
	    				// da bi moglo do 15 da se upise
	    	int tabla[][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
	                          { 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
	                          { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
	                          { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	                          { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
	                          { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
	                          { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
	                          { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	                          { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
	                          { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
	                          { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
	                          { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	                          { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
	                          { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
	                          { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
	                         }; 
	  
	        if (resenjebrojkraljica(tabla, 0) == false) { 
	            System.out.print("Nemoguce je postaviti" + " " + brojKraljica +" " + "kraljice" + " " + "na tablu" + " " + brojKraljica + "x" + brojKraljica); 
	          
	            return false; 
	        }
	        izlaz(tabla); 
	        return true; 
	    		} 
	    	public static void main(String args[]) 
	    	{ 
	    	System.out.println("Unesi broj kraljica(do 15):");
	        kraljice Dame = new kraljice(); 
	        Dame.resenjeKraljica(); 
	        // Mesta koja su oznacena sa 1  na njima je moguce postaviti kraljicu a 0 su nedozvoljena mesta
	    	} 
			} 

