/*
 
	Problem 7 :

	Take no of rows from the user 
	ROWS = 3

	1 3 5
	5 7 9
	9 11 13
*/

import java.util.Scanner;

class Pattern07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number Of Rows");
		int row = sc.nextInt();
		int col = row;

		int num = 1;

		for(int i=1; i<=row; i++) {

			for(int j=1; j<=col; j++) {

				System.out.print(num+" ");
				num+=2;
			}
			System.out.println();
			num-=2;
		}
	}
}
