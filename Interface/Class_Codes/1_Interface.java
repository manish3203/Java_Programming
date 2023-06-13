
interface Demo {

	void fun();                  //Internally : public abstract void fun();
	void gun();                  //Internally : public abstract void gun();

}

class DemoChild implements Demo {

	public void fun() {

		System.out.println("In fun");
	}

	public void gun() {

		System.out.println("In gun");
	}
}

class Client {

	public static void main(String[] args) {

		DemoChild obj = new DemoChild();
		obj.fun();
		obj.gun();
	}
}
