/*
    Program 4 : Write a program to count the odd digit of given number

    Input: 942111423
    Output: count of odd digits = 5
*/

class countOddDigit{
	
	public static void main(String[] args){
		
		int num = 235241239;
		
		int count = 0;
		while(num != 0){
			
			int rem = num % 10;
			if(rem % 2 == 1){
				count++;
			}
			num = num / 10;
		}
		System.out.println("Count of odd digit : " + count);
	}
}
