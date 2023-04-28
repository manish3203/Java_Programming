/* write a program to print the following pattern

   	10
	I H
	7 6 5
	D C B A

USE THIS FOR LOOP STRICTLY for the outer loop
Int row=4;
for(int i =1;i<=row;i++){
}
*/

class Pattern {

	public static void main(String[] args){

		int row = 4;
		int num = 10;
		char ch = 'J';

		for(int i=1; i<=row; i++){
			for(int j=1; j<=i; j++){

				if(i%2 == 1){
					System.out.print(num+" ");
				}else{
					System.out.print(ch+" ");
				}
				num--;
				ch--;
			}
			System.out.println();
		}
	}
}
