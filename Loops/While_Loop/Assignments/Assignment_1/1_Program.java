/*
   Program 1: Write a program to print a table of 2

   Output: 2 4 6 8 10 12 14 16 18 20
*/

class Table{

	public static void main(String[] args){
		
		int num = 2;
		int i = 1;

		while(i <= 10){
			
			System.out.println(i +" * " + num+ " = "+i * num);
			i++;
		}
	}
}
