import java.util.*;

class calculator{
	
	static void Add(int x,int y){

		int ans = x + y;
		System.out.println("Add = " + ans);
	}

	static void Sub(int x,int y){

		int ans = x - y;
		System.out.println("Sub = " + ans);
	}

	static void Mult(int x,int y){

		int ans = x * y;
		System.out.println("Mul = " + ans);
	}

	static void Div(int x,int y){

		int ans = x % y;
		System.out.println("Div = " + ans);
	}
	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the Values x : ");
		int x = obj.nextInt();

		System.out.println("Enter the Values y : ");
		int y = obj.nextInt();

		Add(x,y);
		Sub(x,y);
		Mult(x,y);
		Div(x,y);
	}
}
