
import java.util.*;

class QueueDemo {

	public static void main(String[] args) {

		Queue que = new LinkedList();

		// 1] boolean offer(E);
		que.offer(10);
		que.offer(20);
		que.offer(50);
		que.offer(30);
		que.offer(40);

		System.out.println(que);   // [10, 20, 50, 30, 40]

		// 2] E poll();
		que.poll();
		System.out.println(que);  // [20, 50, 30, 40]
		
		// 3] E peek();
		System.out.println(que.peek()); // 20

	}
}
