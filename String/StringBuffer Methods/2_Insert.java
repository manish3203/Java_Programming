/*
   Method : public synchronized StringBuffer insert(int offset, String str);

   Description : Insert the <code>String</code> argument into this <code>StringBuffer</code>.
                 If str is null, the String "null" is used instead.

   Parameters : Integer(offset the place to insert in this buffer).
                String(str the <code>String</code> to insert).

   Return Type : StringBuffer(this <code>StringBuffer</code>).

*/

class Insert {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("ShashiCore2Web");

		System.out.println(sb);

		sb.insert(6,"Bagal");
		
		System.out.println(sb);
	}
}
