//Real Time Example Abstract : Defence


abstract class Defence {

	void Duty() {

		System.out.println("Defend The Country");
	}
	abstract void Uniform();
}

class Navy extends Defence {

	void Uniform() {

		System.out.println("Uniform = White Color");
	}
}

class Client {

	public static void main(String[] args) {

		Navy obj = new Navy();

		obj.Duty();
		obj.Uniform();
	}
}
