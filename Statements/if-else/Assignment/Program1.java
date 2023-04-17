/* Program 1: Write a java program to check if a number is even or odd.

Input: var=10;
Output: 10 is an even no
Input: var=37;
Output: 37 is an odd no
Input : var = 0
Output: ???

*/

class EvenOdd {

	public static void main(String[] args){

		int var = 191;

		if(var == 0){
			System.out.println(var+ " is an even number");
		}else if(var%2 == 1){
			System.out.println(var+ " is an odd number");
		}else{
			System.out.println(var+ " is an even number");
		}

	}
}
