public
	class Program3_short {
	public static void main (String [] args){
		boolean czyPada = true;
		boolean czySwieciSlonce = false;
		
		if (czyPada == true && czySwieciSlonce == false)
			System.out.println("plucha");
		if (czyPada == true && czySwieciSlonce == true)
			System.out.println("tęcza");
		if (czyPada == false && czySwieciSlonce == true)
			System.out.println("slonecznie");
		if (czyPada == false && czySwieciSlonce == false)
			System.out.println("pochmurno");
	}
	}