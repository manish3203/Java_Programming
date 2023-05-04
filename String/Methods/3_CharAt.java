/*
  Method : public char chatAt(int index)
  
  Description : It returns the character located at specific index with the given string

  Parameter : integer(index)

  Return Type : Character

*/

class CharAtDemo {

	public static void main(String[] args){

		String str = "Core2Web";

		System.out.println(str.charAt(4));
		System.out.println(str.charAt(0));
	//	System.out.println(str.charAt(8));  StringIndexOutOfBounds
	}
}

