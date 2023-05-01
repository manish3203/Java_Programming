/*
  Program 9 : write a program to print a series of strong numbers from entered range. ( Take a start and end number
	      from a user )

		Input:-
		Enter starting number: 1

		Enter ending number: 150

		Output:-
		Output: strong numbers between 1 and 150
		1 2 145
*/

import java.io.*;

class StrongNo {

	static void Strong_Number(int start,int end){
		
		System.out.println("Strong numbers between "+start+" and "+end+" is : ");
		for(int i=start; i<=end; i++){

			int temp = i;
			int mul = 1;
			int sum = 0;

			while(temp!=0){

				int rem = temp%10;

				for(int j=1; j<=rem; j++){
					
					mul = mul*j;
				}
				sum = sum+mul;
				temp = temp/10;
				mul = 1;
			}
			if(i == sum){
				
				System.out.print(i+ " ");
			}
		}
	}	

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter starting number : ");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter ending number : ");
		int end = Integer.parseInt(br.readLine());

		Strong_Number(start,end);

		System.out.println();
	}
}
