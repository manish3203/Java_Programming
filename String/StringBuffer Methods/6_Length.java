/*
   Method : public synchronized int length();

   Description : Get the length of the <code>String<code> tot this <code>StringBuffer</code>
                 would create.
		 Not to be confused with the <em>capacity</em> of the <code>StringBuffer</code>.

   Parameter : No Parameter

   Return type : Integer(the length of this <code>StringBuffer</code>)

*/

class Length {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Core2Web");
		System.out.println(sb.length());
	}
}
