package constructor;

public class User {
	// instance/object variable
	String username;
	String password;

	// ============ default constructor ================
	User() {

		username = "root";
		password = "123";
	}

	// ================== parameterized constructor ===================

	User(String username, String password) {
		this.username = username;
		this.password = password;
		// 'this' keyword represents current object
	}

	User(String username) {
		this.username = username;
	}

	void printUser() {
		System.out.println("UserName = " + username);
		System.out.println("Password = " + password);
	}

	public static void main(String[] args) {

		User u = new User("ram", "3434");
		u.printUser();
	}

}
