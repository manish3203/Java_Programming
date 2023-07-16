//Arithmetic Exception

class Demo {

	void m1() {

		System.out.println("In m1");
		System.out.println(10/0);

		m2();
	}
	void m2() {

		System.out.println("In m2");
	}
	public static void main(String[] args) {

		System.out.println("Start Main");
		
		Demo obj = new Demo();
		obj.m1();

		System.out.println("End Main");
	}
}

/* 
Start Main
In m1
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Demo.m1(3_Arithmetic.java:8)
	at Demo.main(3_Arithmetic.java:21)
*/
