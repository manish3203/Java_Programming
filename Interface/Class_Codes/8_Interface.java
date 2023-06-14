
interface Demo {

	static void fun() {

		System.out.println("In fun");
	}
}
class DemoChild implements Demo {

}
class Client {

	public static void main(String[] args) {

		DemoChild obj = new DemoChild();
		obj.fun();
	}
}

/* error: cannot find symbol
		obj.fun();
		   ^
  symbol:   method fun()
  location: variable obj of type DemoChild
*/
