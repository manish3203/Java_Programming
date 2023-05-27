/*
   Method : public synchronizd int indexOf(String str, int fromIndex);

   Description : Find the first instance of a String in this StringBuffer, starting at a 
                 given index.
		 If the starting index is less than 0, the search start at the beginning to 
		 this string.
		 If the starting index is greater than the length to this string, or the substring 
		 is not found -1 is returned.

   Parameters : String(str String to find);
   	        Integer(fromIndex to start the search)

   Return type : Integer(location (base 0) of the String, or -1 if not found)

*/

class IndexOf {

	public static void main(String[] args) {

		StringBuffer str1 = new StringBuffer("Core2Web");
		System.out.println(str1.indexOf("e"));
	}
}
