
class Demo {

	void marry() {

		System.out.println("Disha Patni");
	}
}
class Client {

	public static void main(String[] args) {

		Demo obj = new Demo() {                         //Internally : Demo obj = new Client$1();

			void marry() {

				System.out.println("Shradha Kapoor");
			}
		};
		obj.marry();
	}
}
