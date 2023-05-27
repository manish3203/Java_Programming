/*
   Method : public synchronized int lastIndexOf(String str, int fromIndex);

   Description : Finds the last instance of a String in this StringBuffer, starting at a given
                 index.
		 If starting index is greater than the maximum valid index, then the search begins
		 at the end of this String.
		 If the starting index is less than 0, or the substring is not found, -1 is returned.

   Parameters : String(str String to find).
                Integer(fromIndex index to start the search).

   Return type : Integer(location (base 0) of the String, or -1 if not found)

*/

class LastIndexOf {

	public static void main(String[] args) {

		StringBuffer str1 = new StringBuffer("Core2Web");
		System.out.println(str1.lastIndexOf("e"));
	}
}
