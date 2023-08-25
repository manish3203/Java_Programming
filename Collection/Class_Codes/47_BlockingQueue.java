
import java.util.concurrent.*;

class BlockingQueueDemo {

	public static void main(String[] args)throws InterruptedException {

		BlockingQueue bq = new ArrayBlockingQueue(3);

		// 1] abstract boolean offer(E);
		bq.offer(10);
		bq.offer(20);
		bq.offer(30);

		System.out.println(bq);  // [10, 20, 30]
	}
}
