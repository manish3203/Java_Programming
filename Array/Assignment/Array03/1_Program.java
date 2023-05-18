/*
  Program 1 : Write a program to print count of digits in elements of array.
		
		Input: Enter array elements : 02 255 2 1554
		Output: 2 3 1 4
*/

import java.io.*;

class CountDigit {

	static void Count(int arr1[]) {
		
		System.out.println("Count of digit in element array");

		for(int i=0; i<arr1.length; i++){
		
			int count = 0;
			int num = arr1[i];

			while(num != 0){
			
				count++;
				num = num/10;

			}
			System.out.println(count);
		}
	}

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of an array");
		int size = Integer.parseInt(br.readLine());

		int arr1[] = new int[size];

		System.out.println("Enter array elements");
		for(int i=0; i<arr1.length; i++){

			arr1[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(" ----------------------------------------------");

		Count(arr1);
	}
}
