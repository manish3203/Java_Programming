import java.util.*;

class IteratorDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("Manish");
		al.add("Aditya");
		al.add("Dhiraj");
		al.add("Ganesh");

		Iterator itr = al.iterator();

		while(itr.hasNext()) {

			if("Rahul".equals(itr.next()))

				itr.remove();
				
			System.out.println(itr.next());
		}
		System.out.println(al);
	}
}

/*
 
   Output :

   Aditya
   Ganesh
   [Manish, Aditya, Dhiraj, Ganesh]
*/
