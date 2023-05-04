/*
  Method : public string Concat(String str);

  Description : Concatinate string to this string i,e another string is concatinated
                with the first string.
		Implements new array of character whose length is sum of str1.length
		and str2.length.

  Parameters : String

  Return type : String

 */

class ConcatDemo {

	public static void main(String[] args){

		String str1 = "Core2";
		String str2 = "Web";

		String str3 = str1.concat(str2);

		System.out.println(str3);
	}
}
