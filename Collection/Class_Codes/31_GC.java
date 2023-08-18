//Garbage Collectior


class Demo {

	String str;

	Demo(String str) {

		this.str = str;
	}
	public String toString() {

		return str;
	}
	public void finalize() {

		System.out.println("Notify");
	}
}
class GCDemo {

	public static void main(String[] args) {

		Demo obj1 = new Demo("Core2Web");
		Demo obj2 = new Demo("Incubator");

		System.out.println(obj1);
		System.out.println(obj2);

		obj1 = null;
		obj2 = null;

		System.gc();
	}
}

/*
Core2Web
Incubator
Notify
Notify
*/

