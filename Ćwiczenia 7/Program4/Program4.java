public
	class Program4 {
	public static void main (String [] args){
	/*wyświetli się PPJ - bo if wykonuje tylko 1 linijkę - nie ma instrukcji grupującej - 
	PPJ -> jest już poza ifem */
		if (3 > 5*2.0)
			System.out.println("Hello");
			System.out.println("PPJ");
	
	// de facto mamy cos takiego
	if (3 > 5*2.0)
			System.out.println("Hello");
		
		System.out.println("PPJ");
	
		}
	}