
class MyThread extends Thread {

	public void run() {

		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
	}
}
class ThreadDemo {

	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());

		MyThread obj1 = new MyThread();
		obj1.start();

		obj1.start();
	}
}

/*

5
5
Exception in thread "main" java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.start(Thread.java:793)
	at ThreadDemo.main(8_MultiThreading.java:20)

*/

