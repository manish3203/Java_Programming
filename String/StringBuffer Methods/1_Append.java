/*
   Method : public synchronized StringBuffer append(String str);

   Description : Append the <code>String</code> to this <code>StringBuffer</code>
                 If str is null, the String "null" is appended.

   Parameters : String(str the <code>String</code> to append).

   Return type : StringBuffer(this <code>StringBuffer</code>)

*/

class Append {

	public static void main(String[] args) {

		StringBuffer str1 = new StringBuffer("Hello");
		String str2 = "World";

		str1.append(str2);

		System.out.println(str1);
	}
}
                
