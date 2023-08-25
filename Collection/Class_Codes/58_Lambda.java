//Runnable interface with lambda fun

class ThreadDemo {

	public static void main(String[] args) {
		
		
		
		Runnable obj1 = ()-> {

			System.out.println(Thread.currentThread().getName());
		};
		Runnable obj2 = ()-> {

			System.out.println(Thread.currentThread().getName());
		};

		Thread t1 = new Thread(obj1);
		t1.start();

		Thread t2 = new Thread(obj2);
		t2.start();
	}
}
