/*
 Program 1 : write a program to print the following pattern

	C2W C2W C2W
	C2W C2W C2W
	C2W C2W C2W

*/

class Pattern {
	public static void main(String[] args){

		int row= 3,col = 3;

		for(int i=1; i<=row; i++){
			for(int j=1; j<=col; j++){
				System.out.print("C2W ");
			}
			System.out.println();
		}
	}
}
