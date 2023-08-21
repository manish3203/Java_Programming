
import java.util.*;

class QueueDemo {

	public static void main(String[] args) {

		Queue que = new LinkedList();

		// 1] boolean add(E);
		que.add(10);
		que.add(20);
		que.add(50);
		que.add(30);
		que.add(40);

		System.out.println(que);   // [10, 20, 50, 30, 40]

		// 2] E remove();
		que.remove();
		System.out.println(que);  // [20, 50, 30, 40]
		
		// 3] E element();
		System.out.println(que.element()); // 20

	}
}
