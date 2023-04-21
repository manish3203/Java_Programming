/*
 Program 2 : write a program to print the following pattern

	4 5 6 7
	4 5 6 7
	4 5 6 7
	4 5 6 7

*/

class Pattern {
	public static void main(String[] args){

		int row= 4,col = 4;

		for(int i=1; i<=row; i++){
			for(int j=1; j<=col; j++){
				System.out.print(3+j+ " ");
			}
			System.out.println();
		}
	}
}
