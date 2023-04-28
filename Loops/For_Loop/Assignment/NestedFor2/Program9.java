/* 
  Program 9 : write a program to print the following pattern

	1C3 4B2 9A1
	16C3 25B2 36A1
	49C3 64B2 81A1

  USE THIS FOR LOOP STRICTLY
  for(int i =1;i<=3;i++){
   for(j=1;j<=3;j++){
 }
}
*/

class Pattern {
	
	public static void main(String[] args){
		
		int num1 = 1;
		int row = 3,col = 3;

		for(int i = 1; i<=row; i++){
			char ch = 'C';
			int num2 = 3;
			for(int j = 1; j<=col; j++){
				
				System.out.print(num1*num1);
				System.out.print(ch);
				System.out.print(num2+ " ");
				num1++;
				ch--;
				num2--;
			}
			System.out.println();
		}
	}
}
