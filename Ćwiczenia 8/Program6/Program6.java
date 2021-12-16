public 
	class Program6{
	public static void main(String[] args){
		System.out.println("// Uzyj formatu x,xx... a nie x.xxx...! //");
		java.util.Scanner in1 = new java.util.Scanner(System.in);
		System.out.println("Podaj pierwsza wartosc liczbowa.");
			float x=in1.nextFloat();
		System.out.println("Podaj druga wartosc liczbowa.");
			float y=in1.nextFloat();
		if ((x-y)>-0.01 && (x-y)<0.01){
			System.out.print("Liczby sa sobie rowne: ");
			System.out.printf("%.2f", x);
			System.out.print(" = ");
			System.out.printf("%.2f", y);
		}
		else 
			System.out.println("Liczby nie sa sobie rowne.");

	}
}