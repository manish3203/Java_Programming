
import java.util.concurrent.*;
import java.util.*;

class ArrayBlockingQueueDemo {

	public static void main(String[] args)throws InterruptedException {

		ArrayBlockingQueue abq = new ArrayBlockingQueue(3);

		abq.offer(10);
		abq.offer(20);
		abq.offer(30);

		System.out.println(abq); //[10, 20, 30]
		
		abq.offer(40, 5, TimeUnit.SECONDS);

		System.out.println(abq); //[10, 20, 30]

		abq.take();

		System.out.println(abq); //[20, 30]

		ArrayList al = new ArrayList();
		
		System.out.println("ArrayList : " + al); //ArrayList : []
		
		abq.drainTo(al);

		System.out.println("ArrayList : " + al); //ArrayList : [20, 30]

		System.out.println(abq);  //[]

	}
}	
