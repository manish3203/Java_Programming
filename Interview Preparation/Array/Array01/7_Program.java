/*
   Program 7 : Write a program to create an array of ‘n’ integer elements.
	       Where ‘n’ value should be taken from the user.
	       Insert the values from users and find the sum of all elements in the array.

		Input:
		n=6
		Enter elements in the array:
		2
		3
		6
		9
		5
		1
		Output:
		26

*/

import java.io.*;

class SumArray {
	
	int SumArrayElements(int arr[]) {
		
		int sum = 0;

		for(int i=0; i<arr.length; i++) {

			sum = sum + arr[i];
		}

		return sum;
	}
	public static void main(String[] args)throws IOException {
		
		SumArray obj = new SumArray();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of an array : ");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		System.out.println("Enter elements in the array : ");
		for(int i=0; i<arr.length; i++) {

			arr[i] = Integer.parseInt(br.readLine());
		}

		int sum = obj.SumArrayElements(arr);

		System.out.println("Sum of array elements is : "+sum);
	}
}
