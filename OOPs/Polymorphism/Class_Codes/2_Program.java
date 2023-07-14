
class Demo {

	int fun(int x) {

		System.out.println(x);
	}
	
	float fun(int x) {

		System.out.println(x);
	}
}

/*  error: method fun(int) is already defined in class Demo
	float fun(int x) {
	      ^
*/
