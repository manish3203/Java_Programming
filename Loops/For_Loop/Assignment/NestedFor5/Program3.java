/* write a program to print the following pattern

	5 4 3 2 1
	8 6 4 2
	9 6 3
	8 4
	5

USE THIS FOR LOOP STRICTLY for the outer loop
Int row;
Take the number of rows from user
for(int i =1;i<=row;i++){
}
*/

import java.io.*;
class Pattern {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Number of Rows : ");
		int row = Integer.parseInt(br.readLine());
		
		int col = row;
		for(int i=1; i<=row; i++){
			int num = col*i;
			for(int j=row; j>=i; j--){
				System.out.print(num+ " ");
				num = num-i;

			}
			col--;
			System.out.println();
		}
	}
}	
