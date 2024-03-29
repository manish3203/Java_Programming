
//Sleep Method

class MyThread extends Thread {

	public void run() {

		System.out.println(Thread.currentThread());
	}
}
class ThreadDemo {

	public static void main(String[] args)throws InterruptedException {

		System.out.println(Thread.currentThread());

		MyThread obj = new MyThread();
		obj.start();

		Thread.sleep(100);

		Thread.currentThread().setName("Core2Web");

		System.out.println(Thread.currentThread());
	}
}

/*
	Thread[main,5,main]
	Thread[Thread-0,5,main]
	Thread[Core2Web,5,main]
*/

