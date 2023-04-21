/*
  Program 5 : write a program to print the following pattern

	12 12 12
	11 11 11
	10 10 10

*/

class Pattern {
	public static void main(String[] args){

		int row= 3,col = 3;
		int num = 12;

		for(int i=1; i<=row; i++){
			for(int j=1; j<=col; j++){
				System.out.print(num+ " ");
			}
			num--;
			System.out.println();
		}
	}
}
