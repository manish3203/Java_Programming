
import java.util.*;

class HashMapDemo {

	public static void main(String[] args) {

		HashMap hm = new HashMap();

		hm.put("Kanha","BMC");
                hm.put("Ashish","Barclays");
                hm.put("Kanha","CorPro");
                hm.put("Rahul","BMC");

                System.out.println("HashMap : - Same key but different values or same values");
                System.out.println(hm);

	}
}

/*
 	HashMap : - Same key but different values or same values
	{Rahul=BMC, Ashish=Barclays, Kanha=CorPro}

*/

