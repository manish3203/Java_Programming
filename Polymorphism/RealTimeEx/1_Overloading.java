// Real Time Example Polymorphism : Overloading


class IPL {

	void matchInfo(String team1,String team2) {

		System.out.println("Match : "+team1+" vs "+team2);
		System.out.println("- - - - - - - - - - - - - - - - ");
	}
	
	void matchInfo(String team1,String team2,String Venue) {

		System.out.println("Match : "+team1+" vs "+team2);
		System.out.println("Venue : "+Venue);
	}
}

class Client {

	public static void main(String[] args) {

		IPL ipl2023 = new IPL();
		ipl2023.matchInfo("GT","CSK");
		ipl2023.matchInfo("GT","CSK","Narendra Modi Stadium,Ahmedabad");
	}
}
