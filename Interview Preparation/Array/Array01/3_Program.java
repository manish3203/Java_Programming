/* 
  Program 3 : Write a program to create an array of ‘n’ integer elements.
	      Where ‘n’ value should be taken from the user.
	      Insert the values from users and print accordingly
	
		Input:
		n=5
		Enter elements in the array :
		1
		2
		3
		4
		5
		Output:
		1
		2
		3
		4
		5
*/

import java.io.*;
class Array {
	
	void printArrayElements(int arr[]) {
		
		System.out.println("Array elements are : ");

		for(int i=0; i<arr.length; i++) {

			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args)throws IOException {
		
		Array obj = new Array();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size Of An Array : ");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];
		
		System.out.println("Enter array elements in the array : ");
		for(int i=0; i<arr.length; i++) {

			arr[i] = Integer.parseInt(br.readLine());
		}

		obj.printArrayElements(arr);
	}
}
