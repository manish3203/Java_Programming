/*
   Program 9 : Write a program to reverse the given number

   Input: 942111423

   Output: 324111249

*/

class reverse{
	
	public static void main(String[] args){
		
		int num =23984756;
		int sum = 0;
		while(num != 0){
			
			int rem = num % 10;
			sum = (sum * 10) + rem;
			num /= 10;
		}
		System.out.println("Reverse number is "+ sum);
	}
}
