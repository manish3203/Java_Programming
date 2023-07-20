
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

		t.setPriority(-2);

		MyThread obj2 = new MyThread();
		obj2.start();
	}
}
/*

5
Exception in thread "main" 5
java.lang.IllegalArgumentException
	at java.base/java.lang.Thread.setPriority(Thread.java:1138)
	at ThreadDemo.main(7_PriorityThread.java:20)
*/
