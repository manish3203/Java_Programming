/* 
  Program 6 : WAP to take size of array from user and also take integer elements from user
	      find the maximum element from the array

		input : Enter size : 5
		Enter array elements: 1 2 5 0 4
		output: max element = 5

*/

import java.io.*;

class MaxElement {

        public static void main(String[] agrs)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter size of an array");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];

                System.out.println("Enter array elements");
                for(int i=0; i<arr.length; i++) {

                        arr[i] = Integer.parseInt(br.readLine());
                }

                int max = arr[0];

                for(int i=0; i<arr.length; i++){

                        if(max < arr[i]){

                                max = arr[i];
                        }
                }
                System.out.print("max element : "+max);
                System.out.println();

        }
}

