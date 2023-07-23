/*

	Problem 6 :

	Take no of rows from the user 
	ROWS = 3

	A b C
	d E f
	G h I

*/

import java.util.Scanner;

class Pattern06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number Of Rows : ");
		int row = sc.nextInt();
		int col = row;

		char ch = 'A';

		for(int i=1; i<=row; i++) {

			for(int j=1; j<=col; j++) {

				if(((i+j)%2 == 0) || (i==j)) {

					System.out.print(ch+" ");
				}else{

					System.out.print((char)(ch+32)+" ");
				}
				ch++;
			}
			System.out.println();
		}
	}

}
