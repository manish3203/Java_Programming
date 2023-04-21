/*
  Program 9 : write a program to print the following pattern

	C B A
	C B A
	C B A

*/

class Pattern {
	public static void main(String[] args){

		int row= 3,col = 3;

		for(int i=1; i<=row; i++){
			char ch = 'C';
			for(int j=1; j<=col; j++){
				System.out.print(ch+ " ");
				ch--;
			};
			System.out.println();
		}
	}
}
