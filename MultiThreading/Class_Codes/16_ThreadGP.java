
class MyThread extends Thread {

	MyThread(ThreadGroup tg, String str) {

		super(tg,str);
	}
	public void run() {

		System.out.println(Thread.currentThread());
	}
}
class ThreadGroupDemo {

	public static void main(String[] args) {
		
		//pthreadGP = Parent Thread Group
		ThreadGroup pthreadGP = new ThreadGroup("Core2Web");

		MyThread obj1 = new MyThread(pthreadGP,"C");
		MyThread obj2 = new MyThread(pthreadGP,"Java");
		MyThread obj3 = new MyThread(pthreadGP,"Python");

		obj1.start();
		obj2.start();
		obj3.start();
		
		//cthreadGP = Child Thread Group
		ThreadGroup cthreadGP = new ThreadGroup("Incubator");

		MyThread obj4 = new MyThread(cthreadGP,"Flutter");
		MyThread obj5 = new MyThread(cthreadGP,"ReactJS");
		MyThread obj6 = new MyThread(cthreadGP,"SpringBoot");
		
		obj4.start();
		obj5.start();
		obj6.start();
	}
}
