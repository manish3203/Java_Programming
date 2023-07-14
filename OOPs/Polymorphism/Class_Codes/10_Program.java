
class Demo {

	void fun(int x, float y) {

		System.out.println("Int-Float Para");
	}
	void fun(float x, int y) {
		
		System.out.println("Float-Int Para");
	}
}

class Client {

	public static void main(String[] args) {

		Demo obj = new Demo();
		obj.fun();
	}
}

/* error: no suitable method found for fun(no arguments)
		obj.fun();
		   ^
    method Demo.fun(int,float) is not applicable
      (actual and formal argument lists differ in length)
    method Demo.fun(float,int) is not applicable
      (actual and formal argument lists differ in length)
*/
