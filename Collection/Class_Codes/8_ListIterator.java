import java.util.*;

class CursorDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("Ganesh");
		al.add("Dhiraj");
		al.add("Manish");
		al.add("Aditya");

		ListIterator litr = al.listIterator();

		while(litr.hasNext()) {

			System.out.println(litr.next());
		}
		while(litr.hasPrevious()) {

			System.out.println(litr.previous());
		}
	}
}
