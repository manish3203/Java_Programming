
class Outer {

	int x = 10;
	static int y = 20;

	class Inner {

		void fun2() {

			System.out.println("Fun2-Inner");
			System.out.println(x);
			System.out.println(y);
			fun1();
		}
	}

	void fun1() {

		System.out.println("Fun1-Outer");
	}
}

class Client {

	public static void main(String[] args) {

		Outer obj = new Outer();

		Outer.Inner obj1 = obj.new Inner();  //Internal : Outer$Inner(obj1,obj);
		obj1.fun2();
		
		Outer.Inner obj2 = obj.new Inner();  //Internal : Outer$Inner(obj2,obj);
		obj2.fun2();
	}
}
