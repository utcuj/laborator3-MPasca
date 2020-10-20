import java.util.Scanner;

public class Bilet {
	private int numere[] = new int[6];
	private byte aparitii[] = new byte[49];
	public int[] getNumere() {
		
		
		 Scanner in = new Scanner(System.in);
		 
		 //citim numerele introduse de la tastatura
		 System.out.println("Scrie numerele alese: ");
		 for(int i = 0; i < 6; i++) {
			 this.numere[i] = in.nextInt();

			 // Daca numarul ales nu se afla in parametri
			 // utilizatorul este avertizat si trebuie sa introduca un numar nou
			 if(numere[i] < 1 || numere[i] > 49) {
				 System.out.println("Numar invalid!");
				 i--;
			 }else {
				 if(aparitii[i] == 0) {
					 aparitii[i] = 1;
				 }
				 else {
					 System.out.println("Numarul a mai fost introdus o data! Introdu alt numar: ");
					 i--;
				 }
			 }
		 }
		 
		in.close();
		return numere;
	}
}
