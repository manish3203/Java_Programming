/* Write a program, and take two characters if these characters are equal then print them as it is but if
they are unequal then print their difference.
{Note: Consider Positional Difference Not ASCIIs}

	Input: a p
	Output: The difference between a and p is 15

*/

import java.io.*;

class Difference {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Starting character : ");
		char ch1 = br.readLine().charAt(0);

		System.out.println("Enter Ending character : ");
		char ch2 = br.readLine().charAt(0);

		int diff;

		if(ch1 == ch2){
			System.out.println("These Characters are equal");
		}else if(ch1 > ch2){
			diff = ch1 - ch2;
			System.out.println("The difference between "+ch1+ " and "+ch2+ " is "+diff);
		}else{
			diff = ch2 - ch1;
			System.out.println("The difference between "+ch1+ " and "+ch2+ " is "+diff);
		}
	}
}
