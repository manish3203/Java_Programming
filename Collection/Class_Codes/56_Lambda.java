//Lambda Function with 1 parameter

interface Core2Web {

	String lang(int numCourse);
}
class Year2022 {

	public static void main(String[] args) {

		Core2Web c2w = (x)-> "Bootcamp/Java/Python/OS"+" : "+x;

		System.out.println(c2w.lang(8));
	}
}
