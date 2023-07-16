//Null Pointer Exception

class Demo {

	void m1() {

		System.out.println("In m1");
	}
	void m2() {

		System.out.println("In m2");
	}
	public static void main(String[] args) {

		System.out.println("start main");

		Demo obj = new Demo();
		obj.m1();

		obj = null;

		obj.m2();
		System.out.println("end main");
	}
}

/*
start main
In m1
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Demo.m2()" because "<local1>" is null
	at Demo.main(4_Nullpointer.java:22)
*/
