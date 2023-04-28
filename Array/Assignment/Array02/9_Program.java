/*
  Program 9 : Write a Java program to merge two given arrays.
	
  		Array1 = [10, 20, 30, 40, 50]
		Array2 = [9, 18, 27, 36, 45]
		Output :
		Merged Array = [10, 20, 30, 40, 50, 9, 18, 27, 36, 45]
		Hint: you can take 3rd array
*/

import java.io.*;

class MergeArray {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of an array");
		int size = Integer.parseInt(br.readLine());

		int arr1[] = new int[size];
		int arr2[] = new int[size];
		int arr3[] = new int[arr1.length + arr2.length];
		
		int merge = 0;

		System.out.println("Enter 1st array elements"); 
		for(int i=0; i<arr1.length; i++){

			arr1[i] = Integer.parseInt(br.readLine());

			arr3[merge] = arr1[i];

			merge++;
		}
		
		System.out.println("Enter 2nd array elements"); 
		for(int i=0; i<arr2.length; i++){

			arr2[i] = Integer.parseInt(br.readLine());

			arr3[merge] = arr2[i];

			merge++;
		}

		System.out.println("Merged Elements are : ");
		System.out.print("[");
		for(int i=0; i<arr3.length- 1; i++){

			System.out.print(arr3[i]+",");

		}
		System.out.println(arr3[arr3.length - 1] + "]");

	}
}
