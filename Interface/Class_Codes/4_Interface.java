
interface Demo {

	static void fun() {

		System.out.println("In fun");
	}
	default void gun() {

		System.out.println("In gun");
	}
}
