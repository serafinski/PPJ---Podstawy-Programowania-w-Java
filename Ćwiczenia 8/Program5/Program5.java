public 
	class Program5{
	public static void main(String[] args){
		System.out.println("Wpisz litere:");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		char ch = scanner.next().charAt(0);
		System.out.println(switch(ch){
			case 'a', 'e', 'i', 'o', 'u' -> "Twoja litera to samogloska.";
			default -> "Twoja litera to spolgoska.";
		});

	}
}