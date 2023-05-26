/*
   Method : public synchronized StringBuffer reverse();

   Description : Reverse the character in this StringBuffer.
                 The same sequence of character exists, but in the reverse index ordering.

   Parameter : No Parameter

   Return Type : StringBuffer(<code>StringBuffer</code>)

*/

class Reverse {

	public static void main(String[] args) {

		String str1 = "Core2Web";
		
		System.out.println(str1);

		StringBuffer sb = new StringBuffer(str1);

		str1 = sb.reverse().toString();

		System.out.println(str1);
	}
}
