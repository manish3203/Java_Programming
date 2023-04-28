/* write a program to print the following pattern

	1
	8 9
	27 16 125
	64 25 216 49

USE THIS FOR LOOP STRICTLY for the outer loop
Int row=4;
for(int i =1;i<=row;i++){
}
*/

class Pattern {

	public static void main(String[] args){

		int row = 4;
		int num1 = 1;

		for(int i=1; i<=row; i++){
			num1 = i;
			for(int j=1; j<=i; j++){

				if(j%2 == 1){

					System.out.print(num1*num1*num1+ " ");
					num1++;
	
				}else{

					System.out.print(num1*num1+" ");
					num1++;
				}
			}
			System.out.println();
			
		}
	}
}
