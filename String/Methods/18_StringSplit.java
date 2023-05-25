/*
   Method : public String[] split(String delimiter);

   Description : Splits the string around matches of regular expression.

   Parameters : delimiter(pattern to match)

   return type : String[](array of split string)

*/

class StringSplit {

	public static void main(String[] args) {

		String str = "Know The Code Till The Core";

		String[] strResult = str.split(" ");

		for(int i=0; i<strResult.length; i++){

			System.out.println(strResult[i]);
		}
	}
}
