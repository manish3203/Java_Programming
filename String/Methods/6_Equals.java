/*
  Method : public boolean equals(object an object);

  Description : Predict which compares an object to this. This is true only for string
                with the same character sequence.
		Returns true if an object is semantically equal to this.

  Parameter : Object(anObject);
   
  Return Type : boolean
*/

class BooleanEqauls {

	public static void main(String[] args){

		String str1 = "Manish";
		String str2 = new String("Manish");

		System.out.println(str1.equals(str2));
	}
}
