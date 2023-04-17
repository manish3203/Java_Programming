/* Program 4: Write a java program that checks a number from 0 to 5 and prints its
spelling, if the number is greater than 5 print the number is greater than 5
Input1 : var= 4
Output: four
Input2 : var = 6
Output: number is greater than 5
Input3 : var = -6
Output: ???    

*/

class ChekNum {
	
	public static void main(String[] args){

		int var = -13;

		if(var == 0){
			System.out.println("Zero");
		}else if(var == 1){
			System.out.println("One");
		}else if(var == 2){
			System.out.println("Two");
		}else if(var == 3){
			System.out.println("Three");
		}else if(var == 4){
			System.out.println("Four");
		}else if(var == 5){
			System.out.println("Five");
		}else if(var > 5){
			System.out.println("Number is greater than 5");
		}else{
			System.out.println("Number is less than 5");
		}
	}
}
