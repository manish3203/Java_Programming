/*
  Program 4 : WAP to search a specific element from an array and return its index.

                Input: 1 2 4 5 6
                Enter element to search: 4
                Output: element found at index: 2
*/

import java.io.*;

class SearchIndex {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter size of an array");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];

                System.out.println("Enter array elements ");
                for(int i=0; i<arr.length; i++) {

                        arr[i] = Integer.parseInt(br.readLine());
                }

                System.out.print("Enter element to search : ");
                int search = Integer.parseInt(br.readLine());

                for(int i=0; i<arr.length; i++) {

                        if(arr[i] == search){

                                System.out.println("Element found at index is : "+i);
                                break;
                        }
                }
        }
}

