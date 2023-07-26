
class MyThread extends Thread {
	
	MyThread(String str) {

		super(str);
	}
	MyThread() {

		super();
	}
	public void run() {

		System.out.println(getName());
		System.out.println(Thread.currentThread().getThreadGroup());
	}
}
class ThreadGroupDemo {

	public static void main(String[] args) {

		MyThread obj1 = new MyThread("XYZ");
		MyThread obj2 = new MyThread("PQR");
		MyThread obj3 = new MyThread();
		
		obj1.start();
		obj2.start();
		obj3.start();
	}
}
