/* Real Time Example Of Inheriace : In Indian Roads or NH = National Highway (Source to Dest ) Number*/

class IndianRoads {

	IndianRoads() {

		System.out.println("In India");
		System.out.println("-----------------------------");
	}
}
class NH66 extends IndianRoads {
	
	String Highway = "Mumbai-Goa";
	NH66() {

		System.out.println("The NH 66 ExpressWay Is");
	}
	void DispInfo() {
		
		System.out.println(Highway+" Highway");
		System.out.println("- - - - - - - - - - - - - - -");
	}
}
class India {

	public static void main(String[] args) {

		NH66 obj1 = new NH66();
		obj1.DispInfo();
		
	}
}
