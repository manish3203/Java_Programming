/*

	Program 1 :

    	Take no of rows from the user 
    	ROWS = 3

	a B c
	d E f
	g H i
*/

import java.util.Scanner;

class Pattern01 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number Of Rows : ");
		int row = sc.nextInt();
		int col = row;

		char ch1 = 'a';

		for(int i=1; i<=row; i++) {

			for(int j=1; j<=col; j++) {

				if(j%2 == 1) {

					System.out.print(ch1+" ");
				}else {

					System.out.print((char)(ch1-32)+" ");
				}
				ch1++;
			}
			System.out.println();
		}	
	}
}
