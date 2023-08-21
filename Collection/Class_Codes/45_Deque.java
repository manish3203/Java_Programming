
import java.util.*;

class DequeDemo {

	public static void main(String[] args) {

		Deque obj = new ArrayDeque();

		// 1] boolean offer(E);
		obj.offer(10);
		obj.offer(40);
		obj.offer(20);
		obj.offer(30);

		System.out.println(obj);  //[10, 40, 20, 30]
		
		// 2] boolean offerFirst(E);
		obj.offerFirst(5);

  		// 3] boolean offerLast(E);
		obj.offerLast(50);

		System.out.println(obj);  //[5, 10, 40, 20, 30, 50]
		
		// 4] E pollFirst();
		obj.pollFirst();

		// 5] E pollLast()
		obj.pollLast();

		System.out.println(obj);  //[10, 40, 20, 30]

		// 6] E peekFirst();
		System.out.println(obj.peekFirst());  //10

		// 7] E peekLast();
		System.out.println(obj.peekLast());  //30

		// 8] Iterator<E> iterator();
		Iterator itr1 = obj.iterator();
		while(itr1.hasNext()) {

			System.out.println(itr1.next());
		}

		/*
 		 10
		 40
		 20
		 30

		 */

		// 9] Iterator<E> descendingIterator();
		Iterator itr2 = obj.descendingIterator();
		while(itr2.hasNext()) {

			System.out.println(itr2.next());
		}

		/*
		 30
		 20
		 40
		 10

		 */

	}
}
