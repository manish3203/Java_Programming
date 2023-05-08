/*
  Method : public string substring(int index);

  Description : Creates a Substring of the given string starting at a specified index and ending
                at the end of given string

  Parameter : Integer(index of the string)

  Return Type : String

*/

class SubString {

	public static void main(String[] args) {

		String str1 = "Core2Web Tech";

		System.out.println(str1.substring(5));
		System.out.println(str1.substring(5,8));
	}
}
