
import java.util.*;

class SortedMapDemo {

	public static void main(String[] args) {

		SortedMap sm = new TreeMap();

		sm.put("Ind","India");
		sm.put("Ban","Bangladesh");
		sm.put("Aus","Australia");
		sm.put("Pak","Pakistan");
		sm.put("SL","SriLanka");

		System.out.println(sm);   //{Aus=Australia, Ban=Bangladesh, Ind=India, Pak=Pakistan, SL=SriLanka}
		
		// 1] SortedMap<K, V> subMap(K, K);
		System.out.println(sm.subMap("Aus","Pak"));  //{Aus=Australia, Ban=Bangladesh, Ind=India}
		
		// 2] SortedMap<K, V> headMap(K);
		System.out.println(sm.headMap("Pak"));  //{Aus=Australia, Ban=Bangladesh, Ind=India}
		
		// 3] SortedMap<K, V> tailMap(K);
		System.out.println(sm.tailMap("Pak"));  //{Pak=Pakistan, SL=SriLanka}
		
		// 4] K firstKey();
		System.out.println(sm.firstKey());  //Aus

		// 5] K lastKey();
		System.out.println(sm.lastKey());  //SL

		// 6] Set<K> keySet();
		System.out.println(sm.keySet());  //[Aus, Ban, Ind, Pak, SL]
		
		// 7] Collection<V> values();
		System.out.println(sm.values());  //[Australia, Bangladesh, India, Pakistan, SriLanka]

		// 8] Map$Entry<K, V>> entrySet();
		System.out.println(sm.entrySet());  //[Aus=Australia, Ban=Bangladesh, Ind=India, Pak=Pakistan, SL=SriLanka]

	}
}
