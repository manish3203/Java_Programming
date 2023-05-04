/*
  Method : public int compareToIgnoreCase(String str1);

  Description : It compare str1 and str2 (case insensitive)

  Parameter : String
  
  Return Type : Integer

 */

class CompareIgnoreDemo {

	public static void main(String[] args){

		String str1 = "Manish";
		String str2 = "manish";

		System.out.println(str1.compareToIgnoreCase(str2));
	}
}
