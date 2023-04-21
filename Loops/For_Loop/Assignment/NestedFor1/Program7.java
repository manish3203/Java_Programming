/*
  Program 7 : write a program to print the following pattern

	D D D D
	D D D D
	D D D D
	D D D D

*/

class Pattern {
	public static void main(String[] args){

		int row= 4,col = 4;
		char ch = 'D';

		for(int i=1; i<=row; i++){
			for(int j=1; j<=col; j++){
				System.out.print(ch+ " ");
			};
			System.out.println();
		}
	}
}
