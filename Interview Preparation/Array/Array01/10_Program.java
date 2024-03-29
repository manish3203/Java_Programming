/*
  Program 10 : Write a program to sort the array in ascending order

 		Input:
		Enter the length of the array
		n=3
		Enter elements in the array
		6
		8
		3
		Output:
		3
		6
		8
*/

import java.io.*;

class AscendingNo {

	void ascendingNo(int arr[]) {
		
		for(int i=0; i<arr.length-1; i++){

			for(int j=0; j<arr.length-1-i; j++){
			
				if(arr[j] > arr[j+1]) {

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the length of the array : ");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		System.out.println("Enter elements in the array : ");
		for(int i=0; i<arr.length; i++) {

			arr[i] = Integer.parseInt(br.readLine());
		}
		
		AscendingNo obj = new AscendingNo();

		obj.ascendingNo(arr);

		System.out.println("Ascending Order Of Elements Is : ");
		for(int i=0; i<arr.length; i++) {

			System.out.println(arr[i]);
		}

	}
}	
