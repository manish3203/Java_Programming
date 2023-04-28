/* write a program to print the following pattern

   	F
	E F
	D E F
	C D E F
	B C D E F
	A B C D E F

USE THIS FOR LOOP STRICTLY for the outer loop
int row =6;
for(int i =1;i<=row;i++){
}
*/

class Pattern {

	public static void main(String[] args){

		char ch1 = 'F';
		int row = 6;

		for(int i=1; i<=row; i++){
			char ch2 = ch1;
			for(int j=1; j<=i; j++){
				System.out.print(ch2+ " ");
				ch2++;
			}
			System.out.println();
			ch1--;
		}
	}
}
