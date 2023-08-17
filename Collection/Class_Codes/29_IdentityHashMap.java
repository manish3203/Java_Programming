
import java.util.*;

class IdentityHashMapDemo {

	public static void main(String[] args) {
		
		IdentityHashMap ihm = new IdentityHashMap();
		ihm.put(new Integer(10),"Dhiraj");
		ihm.put(new Integer(10),"Ganesh");
		ihm.put(new Integer(10),"Omkar");
		ihm.put(new Integer(10),"Aditya");

		System.out.println(ihm);
	}
}

/*
 
   {10=Aditya, 10=Dhiraj, 10=Omkar, 10=Ganesh}
*/
