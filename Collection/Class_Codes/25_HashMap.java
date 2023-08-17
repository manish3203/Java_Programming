
import java.util.*;

class HashMapDemo {

	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add("Kanha");
		hs.add("Ashish");
		hs.add("Badhe");
		hs.add("Rahul");
		
		System.out.println("HashSet : -");
		System.out.println(hs);

		HashMap hm = new HashMap();
		
		hm.put("Kanha","Infosys");
		hm.put("Ashish","Barclays");
		hm.put("Badhe","CorPro");
		hm.put("Rahul","BMC");
		
		System.out.println("HashMap : -");
		System.out.println(hm);
		
	}
}

/*
 	HashSet : -
	[Rahul, Ashish, Badhe, Kanha]
	
	HashMap : -
	{Rahul=BMC, Ashish=Barclays, Badhe=CorPro, Kanha=Infosys}
*/


