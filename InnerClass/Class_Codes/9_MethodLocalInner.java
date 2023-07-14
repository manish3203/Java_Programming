
class Outer {

	Object m1() {

		System.out.println("In m1 Outer");

		class Inner {

			void m1() {

				System.out.println("In m1 Inner");
			}
		}
		return new Inner();
	}
}

class Client {

	public static void main(String[] args) {

		Outer obj = new Outer();
		obj.m1().m1();                      //Method Chaining

	}
}

/* error: cannot find symbol
		obj.m1().m1();                      //Method Chaining
		        ^
  symbol:   method m1()
  location: class Object
*/
