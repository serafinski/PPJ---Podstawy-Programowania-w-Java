public
	class Program3 {
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
		
///////////////////opcja z zajęć 1

		if ( czyPada && czySwieciSlonce)
			;
		if ( !czyPada && czySwieciSlonce)
			;
		if ( czyPada && !czySwieciSlonce)
			;
		if ( !czyPada && !czySwieciSlonce)
			;
		
///////////////////opcja z zajęć 2

		if (czyPada){
			if(czySwieciSlonce){
				;
			}else{
				;
			}
		} else {
			if (czySwieciSlonce){
				;
			} else {
				;
			}
////////////////propozycja ze switchem

		int val = (czy pada ? 1 : 0) + (czySwieciSlonce ? 2: 0);
		
		switch (val1){
			case 0:
				;
				break;
			case 1:
				;
				break;
			case 2:
				;
				break;
			case 3:
				;
				break;

		}
	}