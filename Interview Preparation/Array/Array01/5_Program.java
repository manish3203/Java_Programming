/*
  Program 5 : Write a program to create an array of ‘n’ integer elements.
	      Where ‘n’ value should be taken from the user.
	      Insert the values from users and find the max number from the array


		Input:
		n=5
		Enter elements in the array:
		2
		3
		6
		9
		5
		Output:
		9
*/

import java.io.*;

class MaxNumber {

	int MaxArrayElements(int arr[]){
		
		int MaxNum = arr[0];

		for(int i=1; i<arr.length; i++) {

			if(MaxNum < arr[i]) {

				MaxNum = arr[i];
			}
		}
		return MaxNum;
	}
	public static void main(String[] args)throws IOException {

                MaxNumber obj = new MaxNumber();
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter size of an array : ");
                int n = Integer.parseInt(br.readLine());

                int arr[] = new int[n];

                System.out.println("Enter elements in the array : ");
                for(int i=0; i<arr.length; i++) {

                        arr[i] = Integer.parseInt(br.readLine());
                }

                int returnMax = obj.MaxArrayElements(arr);

		System.out.println("Maximum Numbers In An Array Is : "+returnMax);
        }
}

