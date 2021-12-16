public 
	class Program4{
	public static void main(String[] args){
		System.out.println("Podaj miesiac");

		java.util.Scanner in1 = new java.util.Scanner(System.in);
			int miesiac = in1.nextInt();
		System.out.println("Podaj rok");
			int rok = in1.nextInt();

		System.out.println(
		"Ilosc dni: " + 
		switch(miesiac){
			case 1, 3, 5, 7, 8, 10, 12 -> 31;
			case 4, 6, 9, 11 -> 30;
			case 2 -> {
				if ((rok % 4 == 0 && rok % 100 != 0)|| (rok % 400 ==0))
					yield 28;
				else
					yield 29;
			}
			default -> 0;
		}
		);
	}
}