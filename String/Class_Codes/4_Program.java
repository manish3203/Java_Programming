
class StringDemo {

	public static void main(String[] args){

		String str1 = "Manish";
		String str2 = "Chavan";

		System.out.println(str1+str2);

		String str3 = "ManishChavan";

		String str4 = str1 + str2;

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
