
import java.util.*;

class HashMapDemo {

	public static void main(String[] args) {

		HashMap hm = new HashMap();

		hm.put("Java",".java");
		hm.put("Python",".py");
		hm.put("CPP",".cpp");
		hm.put("Dart",".dart");

		System.out.println(hm);    //{Java=.java, CPP=.cpp, Python=.py, Dart=.dart}
		
		// 1] V get(java.lang.Object);
		System.out.println(hm.get("Python"));   //.py
		
		// 2] Set<K> keySet();
		System.out.println(hm.keySet());   //[Java, CPP, Python, Dart]

		// 3] Collection<V> values();
		System.out.println(hm.values());   //[.java, .cpp, .py, .dart]
		
		// 4] Map$Entry<K, V>> entrySet();
		System.out.println(hm.entrySet());  //[Java=.java, CPP=.cpp, Python=.py, Dart=.dart]

		// 5] V remove(java.lang.Object);
		hm.remove("Python");
		System.out.println(hm);  //{Java=.java, CPP=.cpp, Dart=.dart}

	}
}
