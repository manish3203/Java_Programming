
import java.util.Scanner;
import arithoperator.Addition1;
import arithoperator.Substraction;
import arithoperator.Multiplication;
import arithoperator.Division;

class Client {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number Of X & Y : ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		Addition1 obj1 = new Addition1(x,y);
		Substraction obj2 = new Substraction(x,y);
		Multiplication obj3 = new Multiplication(x,y);
		Division obj4 = new Division(x,y);

		System.out.println("Sum : "+obj1.add());
		System.out.println("Sub : "+obj2.sub());
		System.out.println("Mul : "+obj3.mul());
		System.out.println("Div : "+obj4.div());
	}
}
