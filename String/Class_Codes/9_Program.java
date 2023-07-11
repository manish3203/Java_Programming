//MyStringLength

class MyString {

	static int myStringLen(String str){

		char arr[] = str.toCharArray();

		int count = 0;

		for(int i=0; i<arr.length; i++){

			count++;
		}
		return count;
	}
	
	public static void main(String[] args){

		String str1 = "ManishChavan";

		System.out.println(str1.length());

		int len = myStringLen(str1);

		System.out.println(len);
	}
}
