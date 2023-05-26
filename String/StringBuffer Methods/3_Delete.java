/*
   Method : public synchronized StringBuffer delete(int start, int end);

   Description : Delete character from this <code>StringBuffer</code>.
                 <code>delete(10,12)</code> will delete 10 and 11 but not 12.
		 It is harmless for the end to be larger than length().

   Parameters : Integer(start the first character to delete)
                Integer(end the index after the last character to delete)

   Return type : StringBuffer(this <code>StringBuffer</code>)

*/

class Delete {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Core2Web");

		sb.delete(2,7);

		System.out.println(sb);
	}
}
