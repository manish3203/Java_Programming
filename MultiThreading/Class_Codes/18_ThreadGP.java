
class MyThread extends Thread {

	MyThread(ThreadGroup tg, String str) {

		super(tg, str);
	}
	public void run() {

		System.out.println(Thread.currentThread());

		try {
			
			Thread.sleep(5000);
		}catch(InterruptedException ie) {

			System.out.println(ie.toString());
		}
	}
}
class ThreadGroupDemo {

	public static void main(String[] args)throws InterruptedException {
		
		//Parent Thread Group
		ThreadGroup pThreadGP = new ThreadGroup("India");

		MyThread t1 = new MyThread(pThreadGP,"Maha");
		MyThread t2 = new MyThread(pThreadGP,"Goa");

		t1.start();
		t2.start();

		//Child Thread Group
		ThreadGroup cThreadGP = new ThreadGroup("Pakistan");

		MyThread t3 = new MyThread(cThreadGP,"Karachi");
		MyThread t4 = new MyThread(cThreadGP,"Lahore");

		t3.start();
		t4.start();

		cThreadGP.interrupt();

		System.out.println(pThreadGP.activeCount());
		System.out.println(pThreadGP.activeGroupCount());
	}
}

/*
 
	Thread[Maha,5,India]
    	Thread[Lahore,5,Pakistan]
	2
	Thread[Karachi,5,Pakistan]
	java.lang.InterruptedException: sleep interrupted
	Thread[Goa,5,India]
	java.lang.InterruptedException: sleep interrupted
	0
*/

