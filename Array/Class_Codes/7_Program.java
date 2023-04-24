// Sum of array element

import java.util.*;

class SumArray {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of an array :");
		int size = sc.nextInt();

		int arr1[] = new int[size];
		int sum = 0;
		
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr1.length; i++){

			arr1[i] = sc.nextInt();

			sum = sum + arr1[i];
		}
		System.out.println("Sum of array elements is : "+sum);
	}
}
