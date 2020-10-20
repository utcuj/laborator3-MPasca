public class Ex5 {
	static long factorial(int n) {
		long fact = 1;
		while(n > 1) {
			fact = fact * n;
			n--;
		}
		return fact;
	}
	public static void main(String[] args) {


		Bilet a = new Bilet();
		Loterie lot = new Loterie();
		
		int numereAlese[] = a.getNumere();
		int corecte[] = lot.numereLoterie();
		
		// Verifica daca numerele introduse coincid cu cele extrase
		int count = 0;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(numereAlese[i] == corecte[j]) {
					count++;
				}
				else {
					break;
				}
			}
		}
		
		if(count == 6) {
			System.out.println("Ai castigat!");
		}else {
			System.out.println("Ai pierdut! Numere ghicite: " + count + "/6");
		}
		
		// Afisam numerele extrase
		 for(int i = 0; i < 6; i++) {
			 int j = i+1;
			 System.out.println("Numarul " + j + ": " + corecte[i]);
		 }
		
	}
}
