
import java.util.*;

class Demo {

	String str;

	Demo(String str) {

		this.str = str;
	}
	public String toString() {

		return str;
	}
	public void finalize() {

		System.out.println("Notify");
	}
}
class WeakHashMapDemo {

	public static void main(String[] args) {

		Demo obj1 = new Demo("Core2Web");
		Demo obj2 = new Demo("Incubator");

		WeakHashMap whm = new WeakHashMap();

		whm.put(obj1,2016);
		whm.put(obj2,2019);

		obj1 = null;

		System.gc();

		System.out.println(whm);
	}
}

/*
 Notify
{Incubator=2019}
*/
