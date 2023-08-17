
import java.util.*;

class IdentityHashMapDemo {

	public static void main(String[] args) {
		
		IdentityHashMap ihm = new IdentityHashMap();
		ihm.put(10,"Dhiraj");
		ihm.put(10,"Ganesh");
		ihm.put(10,"Omkar");
		ihm.put(10,"Aditya");

		System.out.println(ihm);
	}
}

/*
 
   {10=Aditya}

*/
