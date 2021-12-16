public 
	class Program8{
	public static void main (String[] args){
		System.out.println("// Uzyj formatu x,xx... a nie x.xxx...! //");
		java.util.Scanner in1 = new java.util.Scanner(System.in);
		System.out.println("Podaj wartosc dla a.");
			double a=in1.nextDouble();
		System.out.println("Podaj wartosc dla b.");
			double b=in1.nextDouble();
		System.out.println("Podaj wartosc dla c.");
			double c=in1.nextDouble();
			double delta = (b*b)-(4*(a*c));
			double pierwiastek = Math.sqrt(delta);
		if (a==0){
			System.out.println("Nie mamy doczynienia z rownaniem kwadaratowym. - poniewaz a == 0");
		}
		else{
			if (delta>0){
				double pierwsze = (-b-pierwiastek)/(2*a);
				double drugie = (-b+pierwiastek)/(2*a);
				System.out.println("Wartosc delty jest rowna: "+delta);
				System.out.println("Jako, ze wartosc delty > 0 - mamy 2 miejsca zerowe");
				System.out.println("Pierwsze miejsce zerowe jest rowne:"+pierwsze);
				System.out.println("Drugie miejsce zerowe jest rowne: "+drugie);
			}
			if (delta==0){
				double zero = (-b)/(2*a);
				System.out.println("Wartosc delty jest rowna: "+delta);
				System.out.println("Jako, ze wartosc delty == 0 - mamy 1 miejsce zerowe");
				System.out.println("Miejsce zerowe to: "+zero);
			}
			else{
				System.out.println("Wartosc delty jest rowna: "+delta);
				System.out.println("Jako, ze wartosc delty < 0 - nie ma miejsc zerowych");
			}
		}
		
	}
}