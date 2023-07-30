
import java.util.Scanner;
import arithfun.Addition;

class Client {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number Of X & Y : ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		Addition obj = new Addition(x,y);

		System.out.println("Sum : "+obj.add());
	}
}
