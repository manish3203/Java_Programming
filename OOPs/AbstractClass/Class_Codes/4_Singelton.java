//Singelton Design 

class Singelton {

	static Singelton obj = new Singelton();

	private Singelton() {

		System.out.println("Constructor");
	}

	static Singelton getObject() {

		return obj;
	}
}

class Client {

	public static void main(String[] args) {

		Singelton obj1 = Singelton.getObject();
		System.out.println(obj1);
		
		Singelton obj2 = Singelton.getObject();
		System.out.println(obj2);
		
		Singelton obj3 = Singelton.getObject();
		System.out.println(obj3);
	}
}
