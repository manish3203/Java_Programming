/*
  Program 10 : write a program to print the following pattern
	
	1 2 3 4
	2 3 4 5
	3 4 5 6
	4 5 6 7

*/

class Pattern {
	public static void main(String[] args){

		int row = 4,col= 4;

		for(int i=1; i<=row; i++){
			for(int j=i; j<=col; j++){
				System.out.print(j+ " ");
			}
			col++;
			System.out.println();
		}
	}
}


