/* Real Time Example Of Inheritance : RTO (Road/Regional Transport Office) Information */
class RTO {

	RTO() {

		System.out.println("RTO Registration Information ");
		System.out.println("- - - - - - - - - - - - - - - -");
	}
}
class District extends RTO {

	String code = "MH-08";
	String district = "Ratnagiri";

	District() {

		System.out.println("In Maharastra State : ");
	}
	void Disp() {

		System.out.println("The Code For "+district+" RTO is : "+code);
	}
}
class Main {

	public static void main(String[] args){

		District Obj1 = new District();
		Obj1.Disp();
	}
}
		
