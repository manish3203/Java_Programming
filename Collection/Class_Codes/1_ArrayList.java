//ArrayList

import java.util.*;

class ArrayListDemo extends ArrayList {

	public static void main(String[] args) {
		
		//Creating Object
		ArrayListDemo al = new ArrayListDemo();

		al.add(10);
		al.add(20.5f);
		al.add("Core2Web");
		al.add(10);
		al.add(20.5f);

		//Print 
		System.out.println(al);

		// 2] int size()
		System.out.println(al.size());     //5

		// 3] boolean contains(java.lang.object)
		System.out.println(al.contains("Manish"));  //true

		// 4] int indexOf(java.lang.object)
		System.out.println(al.indexOf(20.5f));  //1

		// 5] int lastIndexOf(java.lang.object)
		System.out.println(al.lastIndexOf(20.5f)); //4

		// 6] E get(int)
		System.out.println(al.get(3));  //10

		// 7] E set(int , E)
		System.out.println(al.set(3,"Incubator"));  //10 -> Incubator
		System.out.println(al);

		// 8] void add(int, E)
		al.add(3,"Core2Web");  //Core2Web at 3 index
		System.out.println(al); 

		//9] E remove(int)
		System.out.println(al.remove(3));  //Core2Web
		System.out.println(al);

		// 10] boolean remove(java.lang.object)
		System.out.println(al.remove(20.5f));
		System.out.println(al);

		// 11] boolean addAll(collection)
		ArrayList al2 = new ArrayList();
		al2.add("OS C C++");

		al.addAll(al2);
		System.out.println(al);

		// 12] boolean addAll(int , collection)
		al2.add("Flutter Node.js");
		al.addAll(2,al2);
		System.out.println(al);

		// 13] protected removeRange(int, int)
		al.removeRange(2,4);
		System.out.println(al);

		// 14] java.lang.object[] toArray();
		Object arr[] = al.toArray();

		for(Object data : arr) {

			System.out.print(data+ " ");
		}
		System.out.println();

		// 15] void clear();
		al.clear();
		System.out.println(al);
	}
}
