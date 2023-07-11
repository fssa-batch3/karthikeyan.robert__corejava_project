package dayTwo.Mic;

public class App {
	public static void main(String[] args) {
		Academy academy = new Academy();
		academy.setName("FSSA");
		academy.setId(1234);
		academy.setCode("FSSA");

		Student student1 = new Student();
		student1.setName("Karthikeyan");
		student1.setEmail("karthikn352004@@gmail.com");
		student1.setId(189);
		System.out.println("Instence: " + Student.count);

		Student student2 = new Student();
		student2.setName("nandha");
		student2.setEmail("nandha123@gmail.com");
		student2.setId(0105);
		System.out.println("Instence: " + Student.count);

	}
}
