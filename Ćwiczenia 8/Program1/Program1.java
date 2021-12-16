public 
	class Program1{
	public static void main(String[] args){
		double one = Math.random();
		double two = Math.random();
		double three = Math.random();

		double four = Math.random();
		double five = Math.random();
		if (three > 0.2 && four > 0.2 && five > 0.2)
			System.out.println("W puli ostatnich 3 losowan wszystkie wartosci byly wieksze od 0.2.");

		if (four > 0.2 && two > 0.2 && three > 0.2)
			System.out.println("W puli ostatnich 3 losowan wszystkie wartosci byly wieksze od 0.2.");

		if (four > 0.2 && five > 0.2 && three > 0.2)
			System.out.println("W puli ostatnich 3 losowan wszystkie wartosci byly wieksze od 0.2.");
		else
			System.out.println("W puli ostatnich 3 losowań wszystkie wartości były mniejsze od 0.2");

	}
}