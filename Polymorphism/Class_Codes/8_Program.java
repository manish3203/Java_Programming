
class Parent {

	Parent() {

		System.out.println("In Parent Constructor");
	}
	void fun() {

		System.out.println("In Parent Fun");
	}
}

class Child extends Parent {

	Child() {

		System.out.println("In Child Constructor");
	}
	void fun(int x) {

		System.out.println("In Child Fun");
	}
}

class Client {

	public static void main(String[] args) {

		Parent obj1 = new Child();
		obj1.fun();
	}
}
