/*
  Program 5 : Write a program ,take 10 input from the user and print only elements that are divisible by
	      5.

		Input: 10 2 2 3 3 3 4 4 25 55
		Output: 10 25 55

*/

import java.io.*;

class Division {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter array elements ");
		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Array elements that are divisible by 5 ");
		for(int i=0; i<arr.length; i++){

			if(arr[i] % 5 == 0){

				System.out.println(arr[i]);
			}
		}
	}
}
