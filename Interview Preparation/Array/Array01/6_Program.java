/*
   Program 6 : Write a program to create an array of ‘n’ integer elements.
	       Where ‘n’ value should be taken from the user.
    	       Insert the values from users and find the min number from the array


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
		1
*/

import java.io.*;

class MinNumber {

        int MinArrayElements(int arr[]){

                int MinNum = arr[0];

                for(int i=1; i<arr.length; i++) {

                        if(MinNum > arr[i]) {

                                MinNum = arr[i];
                        }
                }
                return MinNum;
        }
        public static void main(String[] args)throws IOException {

                MinNumber obj = new MinNumber();
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter size of an array : ");
                int n = Integer.parseInt(br.readLine());

                int arr[] = new int[n];

                System.out.println("Enter elements in the array : ");
                for(int i=0; i<arr.length; i++) {

                        arr[i] = Integer.parseInt(br.readLine());
                }

                int returnMin = obj.MinArrayElements(arr);

                System.out.println("Maximum Numbers In An Array Is : "+returnMin);
        }
}

