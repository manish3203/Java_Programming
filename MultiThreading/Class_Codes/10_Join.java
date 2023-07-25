//Join Method

class MyThread extends Thread {

	public void run() {

		for(int i=0; i<10; i++) {

			System.out.println("In run");
		}
	}
}
class ThreadDemo {

	public static void main(String[] args)throws InterruptedException {

		MyThread obj = new MyThread();
		obj.start();

		obj.join();

		for(int i=0; i<10; i++) {

			System.out.println("In main");
		}
	}
}
