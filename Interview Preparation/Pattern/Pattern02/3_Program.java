/*

	Problem 3 :

	Take no of rows from the user 
	ROWS = 3

	1 2 3
	2 3 4
	3 4 5

*/

import java.util.Scanner;

class Pattern03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number Of Rows : ");
		int row = sc.nextInt();
		int col = row;

		for(int i=1; i<=row; i++) {
			
			int num = i;
			for(int j=1; j<=col; j++) {

				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
