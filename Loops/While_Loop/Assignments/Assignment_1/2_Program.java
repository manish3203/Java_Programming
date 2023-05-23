/*
   Program 2: Write a program to calulate the factorial of given number.

   Input: 6
   Output: factorial 6 is 720
*/

class Factorial{
	
	public static void main(String[] args){
	
		int num = 6;
		int mul = 1;
		while(num >= 1){
			
			mul = mul * num;
			num--;
		}
		System.out.println("Factorial is "+ mul);
	}
}
