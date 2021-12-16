public
	class Program5 {
	// oczekuje liczby 2
	public static void main (String [] args){
		int a = 10;
		int b = 5;
		int c = 1;
		int res = a-++c-++b;
		System.out.println("Wynik: " + res);
		System.out.println("Czy przypuszczenie bylo prawdziwe: " + (2 == res));
		}
	}