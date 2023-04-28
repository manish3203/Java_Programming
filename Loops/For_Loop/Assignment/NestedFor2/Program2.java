/* 
  Program 2 : write a program to print the following pattern

	4 4 4 4
	5 5 5 5
	6 6 6 6
	7 7 7 7
	
  USE THIS FOR LOOP STRICTLY
  for(int i =1;i<=4;i++){
  for(j=1;j<=4;j++){
  }
}

*/
class Pattern {

        public static void main(String[] args) {

                for(int i = 1; i<=4; i++){
                        for(int j = 1; j<=4; j++){

                                System.out.print((i+3)+" ");
                        }
                        System.out.println();
                }
        }
}
