//Overriding 

class Parent {

	Parent() {

		System.out.println("In Parent Constructor");
	}
	void Property() {

		System.out.println("Car,Flat,Gold");
	}
	void marry() {

		System.out.println("Deepika Padukon");
	}
}

class Child extends Parent {

	Child() {

		System.out.println("In Child Constructor");
	}
	void marry() {

		System.out.println("Shradha Kapoor");
	}
}

class Client {

	public static void main(String[] args) {

		Child obj = new Child();
		obj.Property();
		obj.marry();
	}
}
