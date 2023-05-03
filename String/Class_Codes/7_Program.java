//HashCode

class HashCodeDemo {

	public static void main(String[] args){

		String str1 = "Manish";
		String str2 = new String("Manish");
		String str3 = "Manish";
		String str4 = new String("Manish");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
	}
}
/*
-1997559548
-1997559548
-1997559548
-1997559548
*/
