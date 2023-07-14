//Real Time Example Polymorphism : Overriding

class Match {

	void matchType() {

		System.out.println("MatchType : T20/OneDay/Test");
	}
}

class IPL extends Match {

	void matchType() {

		System.out.println("MatchType : T20");
	}
}

class TestMatch extends Match {

	void matchType() {

		System.out.println("MatchType : Test");
	}
}

class Client {

	public static void main(String[] args) {

		Match type1 = new IPL();
		type1.matchType();
		
		Match type2 = new TestMatch();
		type2.matchType();
	}
}
