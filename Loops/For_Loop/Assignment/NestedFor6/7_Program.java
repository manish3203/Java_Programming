/*
  Program 7 : Write a program to take range as input from the user and print the reverse of all numbers. ( Take a
	      start and end number from a user )

		Input: Enter start: 100
		Enter end: 200
		Output: Palindrome numbers between 100 and 250
*/

import java.io.*;

class Reverse {

	static void Reverse_Number(int start, int end){

		System.out.println("Pallindrom numbers between "+start+" and "+end+" is : ");

		for(int i=start; i<=end; i++){
			
			int temp = i;
			int rev = 0;
			while(temp!=0){

				int rem = temp%10;
				rev = rev*10+rem;
				temp = temp/10;
			}
			System.out.println("Reverse of "+i+" = "+rev);
		}
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter starting number : ");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter ending number : ");
		int end = Integer.parseInt(br.readLine());

		Reverse_Number(start,end);
	}
}
