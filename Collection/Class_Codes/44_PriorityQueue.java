
import java.util.*;

class PQueue {

	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();

		pq.offer("Kanha");
		pq.offer("Ashish");
		pq.offer("Rahul");
		pq.offer("Rajesh");
		pq.offer("Badhe");

		System.out.println(pq);  // [Ashish, Badhe, Rahul, Rajesh, Kanha]

	}
}
