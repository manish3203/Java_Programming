
import java.util.*;

class SortedSetDemo {

	public static void main(String[] args) {

		SortedSet ss = new TreeSet();

		ss.add("Kanha");
		ss.add("Ashish");
		ss.add("Badhe");
		ss.add("Shashi");
		ss.add("Rahul");

		System.out.println(ss);  //[Ashish, Badhe, Kanha, Rahul, Shashi]

		// 1] SortedSet<E> subSet(E, E);
		System.out.println(ss.subSet("Ashish","Rahul"));  //[Ashish, Badhe, Kanha]

		// 2] SortedSet<E> headSet(E);
		System.out.println(ss.headSet("Kanha"));  //[Ashish, Badhe]
		
		// 3] SortedSet<E> tailSet(E);
		System.out.println(ss.tailSet("Kanha"));  //[Kanha, Rahul, Shashi]
		
		// 4] E first();
		System.out.println(ss.first());  //Ashish

		// 5] E last();
		System.out.println(ss.last());  //Shashi


	}
}
