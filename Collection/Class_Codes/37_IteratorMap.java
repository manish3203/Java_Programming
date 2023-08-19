//Iterator over map

import java.util.*;

class IteratorMapDemo {

	public static void main(String[] args) {

		SortedMap sm = new TreeMap();

		sm.put("Ind","India");
		sm.put("Aus","Australia");
		sm.put("SL","SriLanka");
		sm.put("Pak","Pakistan");
		sm.put("Ban","Bangladesh");

		System.out.println(sm);

		Set<Map.Entry> data = sm.entrySet();
		Iterator<Map.Entry> itr = data.iterator();

		while(itr.hasNext()) {

			System.out.println(itr.next());
		}
	}
}

/*
 {Aus=Australia, Ban=Bangladesh, Ind=India, Pak=Pakistan, SL=SriLanka}
 Aus=Australia
 Ban=Bangladesh
 Ind=India
 Pak=Pakistan
 SL=SriLanka
*/

