/* write a program to print the following pattern

	10
	9 8
	7 6 5
	4 3 2 1

USE THIS FOR LOOP STRICTLY for the outer loop

int row=4;
int num=10;
for(int i =1;i<=4;i++){
}
*/

class Pattern {

	public static void main(String[] args){

		int row = 4;
		int num = 10;

		for(int i=1; i<=row; i++){
			for(int j=1; j<=i; j++){

				System.out.print(num+ " ");
				num--;
			}
			System.out.println();
		}
	}
}
