

import java.util.concurrent.*;

class BlockingQueueDemo {

	public static void main(String[] args)throws InterruptedException {

		BlockingQueue bq = new ArrayBlockingQueue(3);

		// 1] void put(E) 
		bq.put(10);
		bq.put(20);
		bq.put(30);

		System.out.println(bq);  //[10, 20, 30]
		
		// 2] boolean offer(E, long, java.util.concurrent.TimeUnit) 
		bq.offer(40,5,TimeUnit.SECONDS);	

		System.out.println(bq);  //[10, 20, 30]
		
		// 3] E take()
		bq.take();
		System.out.println(bq);  //[20, 30]
		
		// 4] int remainingCapacity();
		System.out.println(bq.remainingCapacity()); //1
	}
}

