public
	class Program3{
	public static void main (String[] args){
		{
			// nie musiałem dawać 2 zmiennych logicznych
			boolean Prawda = true;
			boolean Falsz = false;
			int calkowita = 3;
			double pi = 3.14;
			char znak = 'A';
			
			//prawda
			System.out.println(Prawda == Prawda);
			System.out.println(Prawda == Falsz);
			//System.out.println(Prawda == calkowita);
			//System.out.println(Prawda == pi);
			//System.out.println(Prawda == znak);
			
			//falsz
			System.out.println(Falsz == Falsz);
			//System.out.println(Falsz == calkowita);
			//System.out.println(Falsz == pi);
			//System.out.println(Falsz == znak);
			
			//calkowita
			System.out.println(calkowita == calkowita);
			System.out.println(calkowita == pi);
			System.out.println(calkowita == znak);
			
			//pi
			System.out.println(pi == pi);
			System.out.println(pi == znak);
			
		}
	
	}
	
}