/*
   Program 7 : Write a program which takes number from user if number is even print
	       that number in reverse order or if number in reverse by differnce two

	       Input:6
	       output:6 5 4 3 2 1

	       Input:7
	       output:7 5 3 1.
*/
class Assign{
	
	public static void main(String[] args){
		
		int num = 7;	
		int temp = num;

		while(num > 0){
		
			if(temp % 2 == 0){
				
				System.out.println(num);
				num--;
			}else{

				System.out.println(num);
				num -= 2;
			}
		}

	}
}
