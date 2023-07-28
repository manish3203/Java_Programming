
class MyThread implements Runnable {

	public void run() {

		System.out.println(Thread.currentThread());

		try {

			Thread.sleep(3000);
		}catch(InterruptedException ie) {

			System.out.println(ie.toString());
		}
	}
}
class ThreadGroupDemo {

	public static void main(String[] args) {

		ThreadGroup pThread = new ThreadGroup("India");

		MyThread obj1 = new MyThread();
		MyThread obj2 = new MyThread();

		Thread t1 = new Thread(pThread,obj1,"Maha");
		Thread t2 = new Thread(pThread,obj2,"Goa");

		t1.start();
		t2.start();
	}
}
