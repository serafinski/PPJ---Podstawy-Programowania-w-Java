public
	class Program6{
		public static void main(String[] args){
			
			double val = 0.5;
			
			System.out.println("Val = " + val);
			//A
			System.out.println(
			val >= 0 ? "Val nalezy do przedzialu [0, +infinity)" : "Val NIE nalezy do przedzialu [0, +infinity)");
			//B
			System.out.println(
			val <= 1 ? "Val nalezy do przedzialu (-infinity, 1]" : "Val NIE nalezy do przedzialu (-infinity, 1]");
			//C
			System.out.println(
			val >= 0 && val <= 1 ? "Val nalezy do przedzialu [0, 1]" : "Val NIE nalezy do przedzialu [0, 1]");
			
			
			
		
		
		}

}