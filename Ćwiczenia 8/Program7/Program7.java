public 
	class Program7{
	public static void main(String[] args){
		System.out.println("// Uzyj formatu x,xx... a nie x.xxx...! //");
		java.util.Scanner in1 = new java.util.Scanner(System.in);
		System.out.println("Podaj wartosc pierwszego kata.");
			double x=in1.nextDouble();
		System.out.println("Podaj wartosc drugiego kata.");
			double y=in1.nextDouble();
		System.out.println("Podaj wartosc trzeciego kata.");
			double z=in1.nextDouble();
		if (x+y+z==180){
			System.out.println((x<90 && y<90 && z<90)? "Powstal trojkat ostrokatny.":"Powstal trojkat ALE NIE ostrokatny.");
		} else
			System.out.println("Nie powstal trojkat.");
			
			
		
	}
}