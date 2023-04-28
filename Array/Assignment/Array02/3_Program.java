/*
  Program 3 : Write a Java program to find the sum of even and odd numbers in an array.
	      Display the sum value.

		Input: 11 12 13 14 15
		Output
		Odd numbers sum = 39
		Even numbers sum = 26
*/

import java.io.*;

class OddEvenSum {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of an array ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		int evenSum = 0, oddSum = 0;

		System.out.println("Enter the array elements ");
		for(int i=0; i<arr.length; i++) {

			arr[i] = Integer.parseInt(br.readLine());

			if(arr[i] % 2 == 0){

				evenSum = evenSum + arr[i];
			}else{
				oddSum = oddSum + arr[i];
			}
		}
		System.out.println("Odd numbers sum : "+oddSum);
		System.out.println("Even numbers sum : "+evenSum);
	}
}
