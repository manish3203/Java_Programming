
import java.util.*;

class Platform {

	String str = null;
	int foundYear = 0;

	Platform(String str, int foundYear) {

		this.str = str;
		this.foundYear = foundYear;
	}
	public String toString() {

		return "{"+str+" : "+foundYear+"} ";
	}
}
class SortByName implements Comparator {

	public int compare(Object obj1, Object obj2) {

		return((Platform)obj1).str.compareTo(((Platform)obj2).str);
	}
}
class SortByYear implements Comparator {

	public int compare(Object obj1, Object obj2) {

		return((Platform)obj1).foundYear-(((Platform)obj2).foundYear);
	}
}
class TreeMapDemo {

	public static void main(String[] args) {

		//TreeMap tm = new TreeMap(new SortByName());
		TreeMap tm = new TreeMap(new SortByYear());

		tm.put(new Platform("YouTube",2005)," Google");
		tm.put(new Platform("Instagram",2010)," Meta");
		tm.put(new Platform("ChatGPT",2022)," OpenAI");
		tm.put(new Platform("Facebook",2004)," Meta");

		System.out.println(tm);
	}
}

/*
 Sort By Name
 {{ChatGPT : 2022} = OpenAI, {Facebook : 2004} = Meta, {Instagram : 2010} = Meta, {YouTube : 2005} = Google}

 Sort By Year
 {{Facebook : 2004} = Meta, {YouTube : 2005} = Google, {Instagram : 2010} = Meta, {ChatGPT : 2022} = OpenAI}

 */


