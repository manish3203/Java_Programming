/* 
   Program 10 : Write a program to take range as input from the user and print Armstrong numbers. ( Take a start and
 	        end number from a user )

		Input: Enter start: 1
		Enter end: 1650
		Output: Armstrong numbers between 1 and 1650
		1 2 3 4 5 6 7 8 9 153 370 371 407 1634
*/

import java.io.*;

class Armstrong {

	static void Armstrong_Number(int start, int end){
		
		System.out.println("Armstrong numbers between "+start+" and "+end+" is : ");
		for(int i=start; i<=end; i++){

			int temp1 = i;
			int temp2 = i;
			int count = 0;
			int mul = 1;
			int sum= 0;

			while(temp1 != 0){

				count++;
				temp1 = temp1/10;
			}
			while(temp2 != 0){
				
				int rem = temp2%10;

				for(int j=1; j<=count; j++){
					
					mul = mul*rem;
				}
				temp2 = temp2/10;
				sum = sum+mul;
				mul = 1;
			}
			if(sum == i){
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter starting number : ");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter ending number : ");
		int end = Integer.parseInt(br.readLine());

		Armstrong_Number(start,end);

		System.out.println();
	}
}
