
import java.util.Scanner;

class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		try {
			
			if(x == 0) {

				throw new ArithmeticException("Divide By Zero");
			}
			System.out.println(10/x);
		}catch(ArithmeticException ae) {

			System.out.println("Exception In thread "+Thread.currentThread().getName()+" ");
			ae.printStackTrace();
		}
	}
}

/* 0  //This is an Output
Exception In thread main 
java.lang.ArithmeticException: Divide By Zero
	at Demo.main(11_Throw.java:15)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:419)
	at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:192)
	at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:132)
*/
