/*
  Method : public int compareTo(String str);

  Description : It compares the str1 and str2 (case sensitive).
                If both the strings are equal str.compareTo(str1).

  Parameter : String (second string)

  Return Type : Integer

*/

class CompareToDemo {

	public static void main(String[] args) {

		String str1 = "Manish";
		String str2 = "MaNish";

		System.out.println(str1.compareTo(str2));
	}
}
