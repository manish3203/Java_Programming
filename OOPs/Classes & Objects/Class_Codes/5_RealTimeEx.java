
class Login {
	
	String usrName = "Manish";
	int pass = 063;

	void loginPage() {
	
		if(usrName.equals("Manish") && pass == 063) {

			System.out.println("Login SuccessFully");
		}
	}
	public static void main(String[] args) {
		
		Login obj = new Login();

		obj.loginPage();
	}
}
