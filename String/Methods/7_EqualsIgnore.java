/*
  Methods : public boolean equalsIgnoreCase(String another String);

  Description : Compare a string to this string ignoring case

  Parameter : String(str2)

  Return Type : boolean

*/

class EqualsIgnore {

	public static void main(String[] args){

		String str1 = "manish";
		String str2 = new String("MANISH");

		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
