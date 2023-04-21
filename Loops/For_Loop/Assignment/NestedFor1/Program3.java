/*
 Program 3 : write a program to print the following pattern

	14 14 14 14
	15 15 15 15
	16 16 16 16
	17 17 17 17

*/

class Pattern {
	public static void main(String[] args){

		int row= 4,col = 4;
		int num = 14;

		for(int i=1; i<=row; i++){
			for(int j=1; j<=col; j++){
				System.out.print(num+ " ");
			}
			num++;
			System.out.println();
		}
	}
}
