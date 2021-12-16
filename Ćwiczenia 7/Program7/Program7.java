public
	class Program7{
	public static void main(String[] args){
	////// kod 1
	
	
	//a = -3
	
	
	// oczekuje wartości 3
	{int a = -3;
		System.out.println("Dla a = " + a);
	if (a < 0){
		System.out.println("Negative");
		a = a * -1;
		System.out.println("Absolute value is: " + a);
	}
	else {
		System.out.println("Positive");
		System.out.println("Absolute value is: " + a);
	}
	}
	
	
	//a = 0
	
	
	// oczekuje wartości 0
	{int a = 0;
		System.out.println("Dla a = " + a);
	if (a < 0){
		System.out.println("Negative");
		a = a * -1;
		System.out.println("Absolute value is: " + a);
	}
	else {
		System.out.println("Positive");
		System.out.println("Absolute value is: " + a);
	}
	}
	
	
	//a = 5
	
	
	// oczekuje wartości 5
	{int a = 5;
		System.out.println("Dla a = " + a);
	if (a < 0){
		System.out.println("Negative");
		a = a * -1;
		System.out.println("Absolute value is: " + a);
	}
	else {
		System.out.println("Positive");
		System.out.println("Absolute value is: " + a);
	}
	}
	
	
	////// kod 2
	
	
	// a = -3
	
	
	// oczekuje wartości DWUKROTNIE wartości 3 -> wartość otrzymana w wyniku pierwszego if przejdzie na 2 if!
	{int a = -3;
		System.out.println("Dla a = " + a);
	if (a < 0){
		System.out.println("Negative");
		a = a *-1;
		System.out.println("Absolute value is: " + a);
	}
	if (a >= 0){
		System.out.println("Positive");
		System.out.println("Absolute value is: " + a);
	}
	}
	
	
	// a = 0
	
	
	//oczekuje wartości 0
	{int a = 0;
		System.out.println("Dla a = " + a);
	if (a < 0){
		System.out.println("Negative");
		a = a *-1;
		System.out.println("Absolute value is: " + a);
	}
	if (a >= 0){
		System.out.println("Positive");
		System.out.println("Absolute value is: " + a);
	}
	}
	
	// a = 5
	
	// oczekuje wartości 5
		{int a = 5;
		System.out.println("Dla a = " + a);
	if (a < 0){
		System.out.println("Negative");
		a = a *-1;
		System.out.println("Absolute value is: " + a);
	}
	if (a >= 0){
		System.out.println("Positive");
		System.out.println("Absolute value is: " + a);
	}
	}
		}
	}