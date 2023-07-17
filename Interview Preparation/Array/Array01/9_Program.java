/*
   Program 9 : Write a program to create an array of ‘n’ integer elements.
	       Where ‘n’ value should be taken from the user.
	       Insert the values from the user and find the strong number from them

		Input:
		n=5
		Enter elements in the array:
		2
		145
		6
		3
		123
		2
		Output:
		145

*/

import java.io.*;

class StrongNumber {
	
	void strongNum(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {

			int temp = arr[i];               //teporary variable 
			int sum = 0;

			while(temp != 0) {
				
				int fact = 1;
				int rem = temp%10;

				for(int j=1; j<=rem; j++){
					
					fact = fact*j;
				}
				sum = sum+fact;
				temp= temp/10;
			}
			if(sum == arr[i]){
				
				System.out.println("The Strong Number In The Array Is : "+sum);
			}
		}
	}
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Size Of An Array");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];
		
		System.out.println("Enter elements in the array : ");
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		StrongNumber obj = new StrongNumber();
		obj.strongNum(arr);
	}
}
