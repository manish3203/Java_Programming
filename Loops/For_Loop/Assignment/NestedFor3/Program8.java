/* write a program to print the following pattern

   	J
	I H
	G F E
	D C B A

USE THIS FOR LOOP STRICTLY for the outer loop
int row =4;
for(int i =1;i<=row;i++){
}
*/

class Pattern {

	public static void main(String[] args){

		char ch = 'J';
		int row = 4;

		for(int i=1; i<=4; i++){
			for(int j=1; j<=i; j++){

				System.out.print(ch+ " ");
				ch--;
			}
			System.out.println();
		}
	}
}
