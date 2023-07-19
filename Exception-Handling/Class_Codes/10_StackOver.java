
class StackDemo {
	
	static void fun(int x) {

		fun(++x);
	}
	public static void main(String[] args) {
		
		fun(1);
	}
}

// Exception in thread "main" java.lang.StackOverflowError

