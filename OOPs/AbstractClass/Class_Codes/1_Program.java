
abstract class Parent {

	void Career() {

		System.out.println("Doctor");
	}
	abstract void marry();
}

class Client {

	public static void main(String[] args) {

		Parent obj = new Parent();
	}
}

/*  error: Parent is abstract; cannot be instantiated
		Parent obj = new Parent();
*/
