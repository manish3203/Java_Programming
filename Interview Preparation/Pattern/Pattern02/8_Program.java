/*
 
	Problem 8 :
	
	Take no of rows & col from the user 
	ROWS = 6 Col = 4	

	1 2 3 4
	a b c d
	# # # #
	5 6 7 8
	e f g h
	# # # #
*/

import java.util.*;

class Pattern08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number Of Rows : ");
		int row = sc.nextInt();
		
		System.out.println("Enter Number Of Columns : ");
		int col = sc.nextInt();

		int num = 1;
		char ch = 'a';

		for(int i=1; i<=row; i++) {

			for(int j=1; j<=col; j++) {

				if(i%3 == 0) {

					System.out.print("# ");
				}else if(i%2 == 0) {

					System.out.print(ch+ " ");
					ch++;
				}else{

					System.out.print(num+" ");
					num++;
				}
			}
			System.out.println();
		}
	}

}

