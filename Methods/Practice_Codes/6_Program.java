/*
 Program 6 : Composite Numbers in Range : 
*/

import java.io.*;

class Composite{

	static void Composite_num(int start,int end){
		
		System.out.println("Composite Number Range in Between " + start + " to " + end + " : ");
		for(int i = start; i <= end; i++ ){
			
			int count = 0;
			for(int j = 1; j <= i; j++){

				if(i % j == 0){
					
					count++;
				}	
			}
			if(count > 2){
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args)throws IOException{
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the starting number : ");
		int start = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the ending number : ");
		int end = Integer.parseInt(br.readLine());
		
		Composite_num(start,end);
	}
}
