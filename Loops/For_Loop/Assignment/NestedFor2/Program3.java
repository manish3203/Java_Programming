/* 
  Program 3 : write a program to print the following pattern

	14 15 16 17
	15 16 17 18
	16 17 18 19
	17 18 19 20
	
  USE THIS FOR LOOP STRICTLY
  for(int i =1;i<=4;i++){
   for(j=1;j<=4;j++){
  }
}
*/

class Pattern {
	
	public static void main(String[] args){
		
		int row = 4,col = 4;
		int sum = 1;

		for(int i = 1; i<=row; i++){
			int num = 13;
			for(int j = 1; j<=col; j++){

				System.out.print((sum+num)+ " ");
				num++;
			}
			sum++;
			System.out.println();
		}

	}
}
