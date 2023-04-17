/* Program 2: Write a java program, take a number, and print whether it is less than 10 or
greater than 10.

Input1: var=5
Output: 5 Is Less than 10.
Input2: var=16
Output: 16 Is greater than 10.
Input3 : var=10
Output: ??   

*/

class Compare {

	public static void main(String[] args){

		int var = 4;

		if(var > 10){
			System.out.println(var+ " is greater than 10");
		}else if(var < 10){
			System.out.println(var+ " is less than 10");
		}else{
			System.out.println(var+ " is euqal to 10");
		}
	}
}
