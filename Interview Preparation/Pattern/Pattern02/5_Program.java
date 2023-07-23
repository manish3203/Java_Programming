/*

	Problem 5 :

	Take no of rows from the user 
	ROWS = 3

	9 64 7
	36 5 16
	3 4 1

*/

import java.util.*;

class Pattern05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number Of Rows : ");
		int row = sc.nextInt();
		int col = row;

		int num = row*col;

		for(int i=1; i<=row; i++) {

			for(int j=1; j<=col; j++) {

				if(num%2 == 1) {

					System.out.print(num+" ");
				}else{

					System.out.print(num*num+" ");
				}
				num--;
			}
			System.out.println();
		}
	}
}
