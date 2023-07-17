/* 
  Program 2 : Write a program to create an array of 5 integer elements.
	      Insert from the user and print 5 elements from an array
	
		Input:
		1
		2
		3
		4
		5
		Output :
		1
		2
		3
		4
		5

*/

import java.io.*;

class Array {
	
	void printArrayElement(int arr[]) {
		
		System.out.println("Array Elemetents Is : ");
		for(int i=0; i<arr.length; i++) {

			System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args)throws IOException {
		
		Array obj = new Array();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[5];
		
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {

			arr[i] = Integer.parseInt(br.readLine());
		}

		obj.printArrayElement(arr);
	}
}
