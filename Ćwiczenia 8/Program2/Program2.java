public 
	class Program2{
	public static void main(String[] args){
		int wrt = (int)(Math.random()*20)-10;
		System.out.println(wrt);
//wersja ciężka -> nie patrząc na to, że jest typ int
		/*
		if (
			((wrt > -15 && wrt <= -10) || (wrt) > -5 && wrt < 0) || (wrt > 5 && wrt < 10) && ((wrt <= - 13 || (wrt > - 8 && wrt <= -3)) && (wrt >= -4))){
				System.out.println("Zmienna należy do czesci wspolnej tych zbiorow.");
			}
		else
			System.out.println("Zmienna nie należy do czesci wspolnej tych zbiorow.");
			*/

//////////////// PATRZEĆ NA POLECENIA (DZIEDZINA) I ROZRYSOWAĆ WZORY
		if (wrt == -4 || wrt == -3)
			System.out.println("Zmienna należy do czesci wspolnej tych zbiorow.");
		else
			System.out.println("Zmienna nie należy do czesci wspolnej tych zbiorow.");

		

	}
}