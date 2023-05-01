/*
  Program 1 : Write a program to print the numbers divisible by 5 from 1 to 50 & the number is even also print the
	      count of even numbers.

		Input: Enter a lower limit: 1
		Enter upper limit: 50
		Output: 10, 20, 30, 40, 50
		Count = 5
*/

import java.io.*;

class Div {

	static int EvenCount(int lwr, int upr){

		int count = 0;
		
		System.out.println("Numbers divisible by 5 from " + lwr + " to " + upr + " & the number is even : ");
		for(int i=lwr; i<=upr; i++){
			
			if(i%2 == 0){
				if(i%5 == 0){
					count++;
					System.out.print(i+ " ");
				}
			}
		}
		System.out.println();
		return count;
	}

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a lower limit : ");
		int lwr = Integer.parseInt(br.readLine());                 //lwr = lower

		System.out.println("Enter a upper limit : ");
		int upr = Integer.parseInt(br.readLine());                 //upr = upper

		int count = EvenCount(lwr,upr);

		System.out.println("Count "+count);
	}
}

