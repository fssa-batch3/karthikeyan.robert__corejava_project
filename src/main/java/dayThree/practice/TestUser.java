package dayThree.practice;

public class TestUser {
	public static void main(String[] args) {

		User user1 = new User();
		// user
		user1.setName("karthikeyan");
		user1.setEmailId("karthikeyan@gmail.com");
		user1.setPassword("kn2004");

		System.out.println(user1.getName() + " - " + user1.getEmailId() + " - " + user1.getPassword());

//		second instance
		User user2 = new User("sandy", "sandy@gmail.com", "sandy123");

		System.out.println(user2.getName() + " - " + user2.getEmailId() + " - " + user2.getPassword());

	}

}
