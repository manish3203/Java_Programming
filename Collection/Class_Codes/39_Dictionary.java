
import java.util.*;

class DictionaryDemo {

	public static void main(String[] args) {

		Dictionary d = new Hashtable();

		d.put(10,"Sachine");
		d.put(7,"MSD");
		d.put(18,"Virat");
		d.put(45,"Rohit");
		d.put(1,"Rahul");

		System.out.println(d);  //{10=Sachine, 18=Virat, 7=MSD, 1=Rahul, 45=Rohit}
		
		// 1]  int size(); 
		System.out.println(d.size());   //5

		// 2] boolean isEmpty();
		System.out.println(d.isEmpty());  //false
		
		// 3] Enumeration<K> keys();
		Enumeration itr = d.keys();
		while(itr.hasMoreElements()) {

			System.out.println(itr.nextElement());
		}
		/*
		 Output :-
		 10
		 18
		 7
		 1
		 45
		 */


		// 4] Enumeration<V> elements();
		Enumeration itr1 = d.elements();
		while(itr1.hasMoreElements()) {

			System.out.println(itr1.nextElement());
		}

		/*
		Output : -
		Sachine
		Virat
		MSD
		Rahul
		Rohit

		*/


		// 5] V get(java.lang.Object);
		System.out.println(d.get(10));   //Sachine
		
		// 6] put(K, V);
		System.out.println(d.put(1,"Rahul"));  //Rahul

		// 7] V remove(java.lang.Object);
		System.out.println(d.remove(1));  //Rahul
		System.out.println(d);  //{10=Sachine, 18=Virat, 7=MSD, 45=Rohit}

	}
}
