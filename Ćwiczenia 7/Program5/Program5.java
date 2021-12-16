public
	class Program5 {
	public static void main (String [] args){
		System.out.println("Podaj pierwsza liczbe dodatnia calkowita.");
		java.util.Scanner in1 = new java.util.Scanner(System.in);
			int x=in1.nextInt();
		
		System.out.println("Podaj druga liczbe dodatnia calkowita.");
		java.util.Scanner in2 = new java.util.Scanner(System.in);
			int y=in2.nextInt();
		
		
		System.out.println(x%y==0 ? "Druga liczba stanowi wielokrotnosc" : "Druga liczba nie stanowi wielokrotnosci pierwszej liczby");
		
		
		
		/*
		if ((x % y == 0) || (y % x == 0))
			System.out.println("jest");
		else
			System.out.println("nie jest");
		System.out.println("wielokrotnoscia");
		*/
		}
	}