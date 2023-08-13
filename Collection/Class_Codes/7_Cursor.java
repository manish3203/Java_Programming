import java.util.*;

class CursorDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20.2);
		al.add("Manish");

		for(var x : al)
			System.out.println(x.getClass().getName());

		Iterator cursor = al.iterator();

		while(cursor.hasNext()) {

			if("Manish".equals(cursor.next())) {

				cursor.remove();
			}
			System.out.println(al);
		}
	}
}
