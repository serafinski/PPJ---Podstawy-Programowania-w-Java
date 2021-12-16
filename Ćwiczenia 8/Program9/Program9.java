public 
	class Program9{
	public static void main(String[] args){
		System.out.println("Podaj liczbe zdobytych punktow.");

		java.util.Scanner in1 = new java.util.Scanner(System.in);
			double ilosc = in1.nextDouble();
		System.out.println("Podaj maksymalna ilosc punktow mozliwych do zdobycia.");
			double maks = in1.nextDouble();
			double procent = ((ilosc/maks)*100);
			
		if (procent>87.5){
			System.out.println("Zdobyto: " + procent + "%.");
			System.out.println("Ocena: 5");
		}
		else if (procent>81.25){
			System.out.println("Zdobyto: " + procent + "%.");
			System.out.println("Ocena: 4.5");
		}
		else if (procent>75){
			System.out.println("Zdobyto: " + procent + "%.");
			System.out.println("Ocena: 4");
		}
		else if (procent>62.6){
			System.out.println("Zdobyto: " + procent + "%.");
			System.out.println("Ocena: 3.5");
		}
		else if (procent>50){
			System.out.println("Zdobyto: " + procent + "%.");
			System.out.println("Ocena: 3");
		}
		else{
			System.out.println("Zdobyto: " + procent + "%.");
			System.out.println("Nie zaliczone. :(");
		}
		
	}
}