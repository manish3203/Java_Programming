
class Parent {

	char fun() {

		System.out.println("Parent fun");
		return 'A';
	}
}

class Child extends Parent {

	int fun() {

		System.out.println("Child fun");
		return 10;
	}
}

class Client {

	public static void main(String[] args) {

		Parent obj = new Child();
		obj.fun();
	}
}

/* error: fun() in Child cannot override fun() in Parent
	int fun() {
	    ^
  return type int is not compatible with char

*/
