/*
  Method : public boolean endsWith(String suffix);

  Desciption : predicate which determines if the string ends with give suffix
               if the suffix is an empty String. true is returend.
	       throws NullPointerException if suffix is null

  Parameters : prefix String to compare

  return type : boolean

*/

class MyEndsWith {

	public static void main(String[] args) {

		String str = "Know the code till the core";
		System.out.println(str.endsWith("core"));
	}
}
