
import java.util.*;

class DequeDemo {

	public static void main(String[] args) {

		Deque obj = new ArrayDeque();

		// 1] boolean add(E);
		obj.add(10);
		obj.add(40);
		obj.add(20);
		obj.add(30);

		System.out.println(obj);  //[10, 40, 20, 30]

		// 2] void addFirst(E);
		obj.addFirst(5);

		// 3] void addLast(E);
		obj.addLast(50);

		System.out.println(obj);  //[5, 10, 40, 20, 30, 50]
		
		// 4] E removeFirst();
		obj.removeFirst();

		// 5] E removeLast();
		obj.removeLast();

		System.out.println(obj);  //[10, 40, 20, 30]

		// 6] E getFirst();
		System.out.println(obj.getFirst());  //10
		
		// 7] E getLast();
		System.out.println(obj.getLast());  //30
		
	}
}
