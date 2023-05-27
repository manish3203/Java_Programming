/*
   Method : public synchronized StringBuffer replace(int start, int end, String str);

   Description : Replace characters between index <code>start</code> (inclusive) and <code>end</code>
                 (exclusive) with <code>str</code>/
		 If <code>end</code> is larger than the size of this StringBuffer, all characters after
		 <code>start</code> are replaced.

   Parameters : Integer(start the beginning index of characters to delete (inclusive)).
                Integer(end the ending index of characters to delete (exclusive)).
		String(str the new <code>String</code> to insert).

   Return type : StringBuffer(this <code>StringBuffer</code>)

*/

class Replace {

	public static void main(String[] args) {

		StringBuffer str1 = new StringBuffer("Know The Code Untill The Core");
		System.out.println(str1);

		str1.replace(14,20,"Till");
		System.out.println(str1);
	}
}

