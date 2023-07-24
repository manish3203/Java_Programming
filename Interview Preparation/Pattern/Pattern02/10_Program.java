/*
 
	Problem 10 :

	Take no of rows from the user 
	ROWS = 4

	1 4 7 10
	7 10 13 16
	13 16 19 22
	19 22 25 28

*/

import java.util.*;

class Pattern10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number Of Rows : ");
		int row = sc.nextInt();
		int col = row;
		
		int num = 1;

		for(int i=1; i<=row; i++) {

			for(int j=1; j<=col; j++) {

				System.out.print(num+" ");
				num+=3;
			}
			num-=6;
			System.out.println();
		}
	}
}
