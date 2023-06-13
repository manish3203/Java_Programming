//Multiple Inheritance In Java 

interface Demo1 {

	void fun();
}
interface Demo2 {

	void fun();
}
class DemoChild implements Demo1,Demo2 {

	public void fun() {

		System.out.println("in fun child");
	}
}

class Client {

	public static void main(String[] args) {

		Demo1 obj = new DemoChild();
		obj.fun();
	}
}
