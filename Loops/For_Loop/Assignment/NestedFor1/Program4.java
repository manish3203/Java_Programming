/*
 Program 4 : write a program to print the following pattern

	1A 1A 1A
	1A 1A 1A
	1A 1A 1A

*/

class Pattern {
	public static void main(String[] args){

		int row= 3,col = 3;

		for(int i=1; i<=row; i++){
			for(int j=1; j<=col; j++){
				System.out.print("1A ");
			}
			System.out.println();
		}
	}
}
