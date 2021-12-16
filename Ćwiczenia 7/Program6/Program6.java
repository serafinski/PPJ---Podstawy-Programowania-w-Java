public
	class Program6 {
	public static void main (String [] args){
		System.out.println("Podaj pierwsza wartosc liczbowa.");
		java.util.Scanner in1 = new java.util.Scanner(System.in);
			int x=in1.nextInt();
		
		System.out.println("Podaj druga wartosc liczbowa.");
		java.util.Scanner in2 = new java.util.Scanner(System.in);
			int y=in2.nextInt();
		
		if (x > 0 && y > 0){
			System.out.println("Obie liczby sa dodatnie - zostanie wypisana roznica");
			System.out.println("Roznica to " + (x-y));
			
		} if(x < 0 && y < 0){
			System.out.println("Obie liczby sa ujemne - zostanie wypisana suma");
			System.out.println("Suma to " + (x+y));
		}
		}
	}