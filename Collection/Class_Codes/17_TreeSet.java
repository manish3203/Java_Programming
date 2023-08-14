
import java.util.*;

class Movies implements Comparable {

	String movieName = null;
	float totCollection = 0.0f;

	Movies(String movieName, float totCollection) {

		this.movieName = movieName;
		this.totCollection = totCollection;
	}
	public int compareTo(Object obj) {

		return -(movieName.compareTo(((Movies)obj).movieName));
	}
	public String toString() {

		return "{ "+movieName+" : "+totCollection+" }";
	}
}
class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();

		ts.add(new Movies("Gadar 2",150.0f));
		ts.add(new Movies("Jailer",350.0f));
		ts.add(new Movies("OMG 2",120.0f));
		ts.add(new Movies("OpenHeimer",800.0f));

		System.out.println(ts);
	}
}
