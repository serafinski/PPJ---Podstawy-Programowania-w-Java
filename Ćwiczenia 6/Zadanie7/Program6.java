public
	class Program6 {
		public static void main (String [] args){
			java.util.Scanner in = new java.util.Scanner(System.in);
			int x=in.nextInt();
			
			System.out.println(
			(x < 10) ? "Liczba jest mniejsza od 10" : (x < 100) ? "Liczba jest mniejsza od 100" : (x < 1000) ? "Liczba jest mniejsza od 1000" : "Liczba jest wieksza od 1000");
		}
	}