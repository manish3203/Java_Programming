/*
  Program 6 : write a program to print the following pattern

	9 8 7
	9 8 7
	9 8 7

*/

class Pattern {
	public static void main(String[] args){

		int row= 3,col = 3;

		for(int i=1; i<=row; i++){
			int num = 9;
			for(int j=1; j<=col; j++){
				System.out.print(num+ " ");
				num--;
			}
			System.out.println();
		}
	}
}
