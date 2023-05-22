/*
  Method : public boolean startsWith(String prefix, int toffset);

  Description : Predict which determines if the given string contains the given prefix beginning
                comparison at toffset.

		The result is false if the toffset is negative or greater than str.length().

  Parameters : prefix string to compare, toffset offset for this string where the comparision Starts.

  return type : boolean

*/

class StartsWith {

	public static void main(String[] args) {

		String str = "Core2Web";
		System.out.println(str.startsWith("or",1));
	}
}
