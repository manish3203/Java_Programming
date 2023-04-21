/*
  Program 8 : write a program to print the following pattern

	d d d d
	c c c c
	b b b b
	a a a a

*/

class Pattern {
	public static void main(String[] args){

		int row= 4,col = 4;
		char ch = 'd';

		for(int i=1; i<=row; i++){
			for(int j=1; j<=col; j++){
				System.out.print(ch+ " ");
			};
			ch--;
			System.out.println();
		}
	}
}
